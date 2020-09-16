package com.sspu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sspu.mapper.MessageTemplateMapper;
import com.sspu.model.MessageTemplate;
import com.sspu.service.MessageTemplateService;

import java.util.List;

@Service
public class MessageTemplateServiceImpl implements MessageTemplateService {

    @Resource
    private MessageTemplateMapper messageTemplateMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return messageTemplateMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MessageTemplate record) {
        return messageTemplateMapper.insert(record);
    }

    @Override
    public int insertSelective(MessageTemplate record) {
        return messageTemplateMapper.insertSelective(record);
    }

    @Override
    public MessageTemplate selectByPrimaryKey(Integer id) {
        return messageTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MessageTemplate record) {
        return messageTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MessageTemplate record) {
        return messageTemplateMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<MessageTemplate> findAll() {
        return messageTemplateMapper.findAll();
    }

}



