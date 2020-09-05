package com.sspu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sspu.model.SysAdmin;
import com.sspu.mapper.SysAdminMapper;
import com.sspu.service.SysAdminService;

import java.util.Map;

@Service
public class SysAdminServiceImpl implements SysAdminService{

    @Resource
    private SysAdminMapper sysAdminMapper;

    @Override
    public SysAdmin selectByUserNameAndPassword(Map map) {
        return sysAdminMapper.selectByUserNameAndPassword(map);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sysAdminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysAdmin record) {
        return sysAdminMapper.insert(record);
    }

    @Override
    public int insertSelective(SysAdmin record) {
        return sysAdminMapper.insertSelective(record);
    }

    @Override
    public SysAdmin selectByPrimaryKey(Integer id) {
        return sysAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysAdmin record) {
        return sysAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysAdmin record) {
        return sysAdminMapper.updateByPrimaryKey(record);
    }

}
