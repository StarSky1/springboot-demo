package com.yj.springbootdemo.dao;

import com.yj.springbootdemo.model.t_student;

import java.util.List;

public interface t_studentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(t_student record);

    int insertSelective(t_student record);

    t_student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(t_student record);

    int updateByPrimaryKey(t_student record);

    List<t_student> getStudents();
}