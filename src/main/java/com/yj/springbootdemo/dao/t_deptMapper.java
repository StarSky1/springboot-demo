package com.yj.springbootdemo.dao;

import com.yj.springbootdemo.model.t_dept;

public interface t_deptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(t_dept record);

    int insertSelective(t_dept record);

    t_dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(t_dept record);

    int updateByPrimaryKey(t_dept record);
}