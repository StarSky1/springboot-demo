package com.yj.springbootdemo.service;

import com.yj.springbootdemo.model.t_student;

import java.util.List;

public interface StudentService {

    List<t_student> getStudents();

    int updateStudent(t_student student);
}
