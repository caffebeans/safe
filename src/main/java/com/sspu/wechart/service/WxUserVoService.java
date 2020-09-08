package com.sspu.wechart.service;

import com.sspu.wechart.vo.WxUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxUserVoService{

    List<WxUserVo> findAll();

    int deleteByOpenId(String openId);

    WxUserVo selectByOpenId(String openId);

    int deleteByPrimaryKey(Integer id);

    int insert(WxUserVo record);

    int insertSelective(WxUserVo record);

    WxUserVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxUserVo record);

    int updateByPrimaryKey(WxUserVo record);

}
