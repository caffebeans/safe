package com.sspu.service;

import com.sspu.model.MessageTemplate;

import java.util.List;

public interface MessageTemplateService {


    int deleteByPrimaryKey(Integer id);

    int insert(MessageTemplate record);

    int insertSelective(MessageTemplate record);

    MessageTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageTemplate record);

    int updateByPrimaryKey(MessageTemplate record);

    List<MessageTemplate> findAll();

}



