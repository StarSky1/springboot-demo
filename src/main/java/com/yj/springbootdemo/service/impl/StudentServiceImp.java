package com.yj.springbootdemo.service.impl;

import com.yj.springbootdemo.model.t_student;
import com.yj.springbootdemo.service.StudentService;
import com.yj.springbootdemo.dao.t_studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private  t_studentMapper t_studentMapper;

    @Override
    public List<t_student> getStudents() {
        return t_studentMapper.getStudents();
    }

    @Override
    @Transactional
    public int updateStudent(t_student student) {
        int updateItems=t_studentMapper.updateByPrimaryKeySelective(student);
        System.out.println("更新数量： "+updateItems);
        int i=10/0;
        return updateItems;
    }
}
