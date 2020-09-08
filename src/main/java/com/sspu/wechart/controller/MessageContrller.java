package com.sspu.wechart.controller;

import com.sspu.model.MessageTemplate;
import com.sspu.model.WxMessage;
import com.sspu.service.MessageTemplateService;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 14:35
 **/

@RestController
//Controllerhttp://zhang.nat100.top/wx/portal/wx63c3aeb53a76d68b
@RequestMapping("/wxx/portal")
@Slf4j
public class MessageContrller {



     @Autowired
     private WxMpService mpService;

     @Autowired
     private  WxMpMessageRouter messageRouter;

     @Autowired
     private MessageTemplateService messageTemplateService;


    @PostMapping( "/{appid}")
     String getMessage(@RequestBody WxMessage msg, HttpServletRequest request, HttpServletResponse response) throws Exception{


          System.out.println(msg.getContent());
          System.out.println(msg);
          System.out.println();
          log.info("进行日报");

         return "ok";

     }

     @PostMapping("/sendMessageFromTemplate")
     String sendMessageFromTemplate(@RequestBody Map<String,String> map) throws Exception{

         log.info("处理数据");
         String tempId=map.get("tempId");
         Integer integer = new Integer(tempId);
         int i = integer.intValue();

         MessageTemplate messageTemplate = messageTemplateService.selectByPrimaryKey(i);
         String msg=messageTemplate.getContent().replace("${data}",map.get("toUser"));

         mpService.getKefuService().sendKefuMessage(
                 WxMpKefuMessage
                         .TEXT()
                         .toUser(map.get("openId"))
                         .content(msg)
                         .build()
         );

         return "ok";
     }

    @PostMapping("/sendText")
    String sendMessage(@RequestBody Map<String,String> map) throws Exception{

        mpService.getKefuService().sendKefuMessage(
                WxMpKefuMessage
                        .TEXT()
                        .toUser(map.get("openId"))
                        .content(map.get("content"))
                        .build()
        );

        return "ok";
    }




}
