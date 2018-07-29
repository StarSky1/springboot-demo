package com.yj.springbootdemo.controller;

import com.yj.springbootdemo.model.t_student;
import com.yj.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/boot/students")
    public Object getStudents(){
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
