package com.sspu.wechart.service.impl;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sspu.wechart.vo.WxUserVo;
import com.sspu.wechart.mapper.WxUserVoMapper;
import com.sspu.wechart.service.WxUserVoService;

import java.util.List;

@Service
public class WxUserVoServiceImpl implements WxUserVoService{

    @Resource
    private WxUserVoMapper wxUserVoMapper;

    //查询所用的用户
    @Override
    public List<WxUserVo> findAll() {
        return wxUserVoMapper.findAll();
    }

    @Override
    public int deleteByOpenId(String openId) {
        return wxUserVoMapper.deleteByOpenId(openId);
    }

    @Override
    public WxUserVo selectByOpenId(String openId) {
        return wxUserVoMapper.selectByOpenId(openId);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return wxUserVoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(WxUserVo record) {
        return wxUserVoMapper.insert(record);
    }

    @Override
    public int insertSelective(WxUserVo record) {
        return wxUserVoMapper.insertSelective(record);
    }

    @Override
    public WxUserVo selectByPrimaryKey(Integer id) {
        return wxUserVoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WxUserVo record) {
        return wxUserVoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WxUserVo record) {
        return wxUserVoMapper.updateByPrimaryKey(record);
    }

}
