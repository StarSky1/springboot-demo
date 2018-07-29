package com.yj.springbootdemo.service.impl;

import com.yj.springbootdemo.model.t_student;
import com.yj.springbootdemo.service.StudentService;
import com.yj.springbootdemo.dao.t_studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private  t_studentMapper t_studentMapper;

    @Override
    public List<t_student> getStudents() {
        return t_studentMapper.getStudents();
    }
}
