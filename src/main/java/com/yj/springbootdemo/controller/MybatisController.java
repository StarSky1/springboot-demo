package com.yj.springbootdemo.controller;

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
}
