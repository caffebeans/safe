package com.sspu.mapper;

import com.sspu.model.MessageTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageTemplateMapper {

      List<MessageTemplate> findByAll();

    int deleteByPrimaryKey(Integer id);

    int insert(MessageTemplate record);

    int insertSelective(MessageTemplate record);

    MessageTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageTemplate record);

    int updateByPrimaryKey(MessageTemplate record);
}