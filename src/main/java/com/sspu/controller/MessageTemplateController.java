package com.sspu.controller;

import com.oracle.tools.packager.Log;
import com.sspu.model.MessageTemplate;
import com.sspu.service.MessageTemplateService;
import com.sspu.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @des: 消息模板管理
 * @author: zhangliang
 * @create: 2020-09-06 14:25
 **/

@RestController
@Slf4j
@RequestMapping("/messageTemplate")
public class MessageTemplateController {


    @Autowired
    MessageTemplateService templateService;


    @RequestMapping("/list")
    ResultVO list(){

        log.info("获取模板消息");
        System.out.println("获取模板消息");
        ResultVO resultVO = new ResultVO();
        try{
            List<MessageTemplate> list = templateService.findAll();
            resultVO.setData(list);
            resultVO.setCode(200);
            resultVO.setMsg("successful");
        }catch(Exception e){
            resultVO.setData(null);
            resultVO.setCode(2000);
            resultVO.setMsg("模板获取失败");
            e.printStackTrace();
        }
        return resultVO;
    }

    @RequestMapping("/add")
    ResultVO add(@RequestBody MessageTemplate messageTemplate){

        ResultVO resultVO = new ResultVO();
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        dateFormat.format(date);

         try{
             messageTemplate.setCreateTime(date);
             int i = templateService.insertSelective(messageTemplate);
             if (i==1){
               resultVO.sucesss("1");
             }
            }catch(Exception e){

             resultVO.setData(null);
             resultVO.setMsg("2001");
             resultVO.setMessage("插入失败");
             e.printStackTrace();
         }

        return resultVO;
    }

    @RequestMapping("/del")
    ResultVO del(@RequestBody Map map){


        ResultVO resultVO = new ResultVO();
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        dateFormat.format(date);
        System.out.println(map.get("id"));

        try{

            int i = templateService.deleteByPrimaryKey(Integer.valueOf(3));
            if (i==1){
                resultVO.sucesss("1");
            }
        }catch(Exception e){

            resultVO.setData(null);
            resultVO.setMsg("2001");
            resultVO.setMessage("失败");
            e.printStackTrace();
        }

        return resultVO;
    }


}
