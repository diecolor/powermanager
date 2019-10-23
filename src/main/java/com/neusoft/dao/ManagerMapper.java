package com.neusoft.dao;

import com.neusoft.bean.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Integer managerId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
    //map.put("param",param)
    //    //map.put("phone",phone); map.put("id",id);
    List<Manager> selectAll(Map map);

    int insertAll(List<Manager> list);

    int deletall(List<Integer> list);

    List<Manager> login(Map map);
}