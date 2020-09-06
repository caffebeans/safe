package com.sspu.wechart.controller;

import com.sspu.model.MessageTemplate;
import com.sspu.model.WxMessage;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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



    @PostMapping( "/{appid}")
     String getMessage(@RequestBody WxMessage msg, HttpServletRequest request, HttpServletResponse response) throws Exception{


          System.out.println(msg.getContent());
          System.out.println(msg);
          System.out.println();
          log.info("进行日报");

         return "ok";

     }

     @RequestMapping("/sendMessage")
     String sendMessage() throws Exception{

         log.info("进行日报");
         mpService.getKefuService().sendKefuMessage(
                 WxMpKefuMessage
                         .TEXT()
                         .toUser("oOqJd6M6M_zOdOFNSzHVrnHdAORM")
                         .content("你是张")
                         .build()
         );




         return "ok";
     }

    @RequestMapping("/sendMessages")
    String sendMessage(MessageTemplate messageTemplate, List openId) throws Exception{

        log.info("进行日报");




        mpService.getKefuService().sendKefuMessage(
                WxMpKefuMessage
                        .TEXT()
                        .toUser("")
                        .content(messageTemplate.getContent())
                        .build()
        );
        return "ok";
    }



}
