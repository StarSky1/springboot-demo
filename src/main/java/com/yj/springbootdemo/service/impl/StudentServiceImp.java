package com.yj.springbootdemo.service.impl;

import com.yj.springbootdemo.model.t_student;
import com.yj.springbootdemo.service.StudentService;
import com.yj.springbootdemo.dao.t_studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private  t_studentMapper t_studentMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public List<t_student> getStudents() {
        //使用redis字符串序列化器序列化key
        RedisSerializer redisSerializer=new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);

        //高并发条件下，有点问题，缓存会被穿透
        List<t_student> studentList=(List<t_student>) redisTemplate.opsForValue().get("allStudents");
        //为保证1W人同时访问时，只有一人访问数据库，其他人访问缓存，这里使用双重检测锁
        if(studentList == null){
            synchronized(this) {
                //再次从缓存中获取一下
                studentList = (List<t_student>) redisTemplate.opsForValue().get("allStudents");
                //如果redis缓存中没有学生列表数据
                if(studentList==null){
                    //就查询数据库获取学生列表，并放入缓存中
                    studentList=t_studentMapper.getStudents();
                    redisTemplate.opsForValue().set("allStudents",studentList);
                    System.out.println("查询的数据库....");
                }else{
                    System.out.println("查询的缓存....");
                }
            }
        }else{
            System.out.println("查询的缓存....");
        }

        return studentList;
    }

    @Override
    @Transactional
    public int updateStudent(t_student student) {
        int updateItems=t_studentMapper.updateByPrimaryKeySelective(student);
        System.out.println("更新数量： "+updateItems);
        int i=10/0;
        return updateItems;
    }

    @Override
    public t_student getStudent(int id) {
        return t_studentMapper.selectByPrimaryKey(id);
    }
}
