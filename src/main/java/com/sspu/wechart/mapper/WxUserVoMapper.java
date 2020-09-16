package com.sspu.wechart.mapper;

import com.sspu.wechart.vo.WxUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WxUserVoMapper {

    List<WxUserVo> findAll();

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("openId") String openId);

    int insert(WxUserVo record);

    int insertSelective(WxUserVo record);

    WxUserVo selectByPrimaryKey(@Param("id") Integer id, @Param("openId") String openId);

    int updateByPrimaryKeySelective(WxUserVo record);

    int updateByPrimaryKey(WxUserVo record);

    int deleteByOpenId(String openId);

    int deleteByPrimaryKey(String openId);
}