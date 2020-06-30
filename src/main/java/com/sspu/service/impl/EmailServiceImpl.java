package com.sspu.service.impl;

import com.sspu.service.EmailServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-06-24 17:30
 **/


@Service
public class EmailServiceImpl implements EmailServer {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;




    @Override
    public void sendTextMail(String toAddr, String title, String content) {

        // 纯文本邮件对象
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("710761875@qq.com");
        message.setTo(toAddr);
        message.setSubject(title);
        message.setText(content);

        try {
            mailSender.send(message);
            logger.info("Text邮件已经发送。");
        } catch (Exception e) {
            logger.error("发送Text邮件时发生异常！", e);
        }




    }

    @Override
    public void sendHtmlMail(String toAddr, String title, String content) {

    }

    @Override
    public void sendAttachmentsMail(String toAddr, String title, String content, String filePath) {

    }

    @Override
    public void sendInlineResourceMail(String toAddr, String title, String content, String rscPath, String rscId) {

    }
}
