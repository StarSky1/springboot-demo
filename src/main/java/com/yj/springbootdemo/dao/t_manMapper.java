package com.yj.springbootdemo.dao;

import com.yj.springbootdemo.model.t_man;

public interface t_manMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(t_man record);

    int insertSelective(t_man record);

    t_man selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(t_man record);

    int updateByPrimaryKey(t_man record);
}