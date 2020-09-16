package com.sspu.wechart.service;

import com.sspu.wechart.vo.WxUserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxUserVoService {


    List<WxUserVo> find();

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("openId") String openId);

    int insert(WxUserVo record);

    int insertSelective(WxUserVo record);

    WxUserVo selectByPrimaryKey(@Param("id") Integer id, @Param("openId") String openId);

    int updateByPrimaryKeySelective(WxUserVo record);

    int updateByPrimaryKey(WxUserVo record);

    int deleteByOpenId(String openId);
}

