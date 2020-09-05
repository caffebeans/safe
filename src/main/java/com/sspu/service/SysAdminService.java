package com.sspu.service;

import com.sspu.model.SysAdmin;

import java.util.Map;

public interface SysAdminService{


    SysAdmin  selectByUserNameAndPassword(Map map);

    int deleteByPrimaryKey(Integer id);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    SysAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);

}
