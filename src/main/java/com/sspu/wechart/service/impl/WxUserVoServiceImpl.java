package com.sspu.wechart.service.impl;

import com.sspu.wechart.mapper.WxUserVoMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.sspu.wechart.vo.WxUserVo;
import com.sspu.wechart.service.WxUserVoService;

import java.util.List;

@Service
public class WxUserVoServiceImpl implements WxUserVoService {

    @Resource
    private WxUserVoMapper wxUserVoMapper;

    @Override
    public List<WxUserVo> find() {
        return wxUserVoMapper.findAll();
    }

    @Override
    public int deleteByPrimaryKey(Integer id, String openId) {
        return wxUserVoMapper.deleteByPrimaryKey(id, openId);
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
    public WxUserVo selectByPrimaryKey(Integer id, String openId) {
        return wxUserVoMapper.selectByPrimaryKey(id, openId);
    }

    @Override
    public int updateByPrimaryKeySelective(WxUserVo record) {
        return wxUserVoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WxUserVo record) {
        return wxUserVoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteByOpenId(String openId) {
        return wxUserVoMapper.deleteByPrimaryKey(openId);
    }

}

