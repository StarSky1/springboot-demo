package com.yj.springbootdemo.controller;

import com.yj.springbootdemo.model.t_student;
import com.yj.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class MybatisController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/boot/students")
    public Object getStudents(){
        //创建线程，该线程调用底层查询所有学生的方法
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                studentService.getStudents();
            }
        };
        //多线程测试一下缓存穿透问题
        ExecutorService executorService=Executors.newFixedThreadPool(25);
        for (int i=0;i<1000;i++){
            executorService.submit(runnable);
        }
        return studentService.getStudents();
    }

    @GetMapping("/boot/updateStudent")
    public int updateStudent(){
        t_student student=new t_student();
        student.setSid(1203);
        student.setSname("余少波-update");
        return studentService.updateStudent(student);
    }
}
