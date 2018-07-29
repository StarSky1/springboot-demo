package com.yj.springbootdemo.controller;

import com.yj.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTfulController {

    @Autowired
    private StudentService studentService;

    // RESTful风格接口地址：http://localhost:8080/springboot-demo/boot/student/1206
    @GetMapping("/boot/student/{sid}")
    public Object getStudent(@PathVariable("sid") int id){  //PathVariable注解 用来获取请求地址中的sid
        return studentService.getStudent(id);
    }
}
