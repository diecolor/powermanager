package com.test.dao;

import com.test.bean.Manager;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer manager_id);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer manager_id);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}