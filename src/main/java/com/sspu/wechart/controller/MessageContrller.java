package com.sspu.wechart.controller;

import com.sspu.model.MessageTemplate;
import com.sspu.model.WxMessage;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 14:35
 **/

@RestController
//Controllerhttp://zhang.nat100.top/wx/portal/wx63c3aeb53a76d68b
@RequestMapping("/wx/portal")
@Slf4j
public class MessageContrller {



     @Autowired
     private WxMpService mpService;


     @PostMapping( "/{appid}")
     String getMessage(@RequestBody WxMessage msg) throws Exception{

         WxMenu wxMenu = new WxMenu();
         WxMenuButton wxMenuButton = new WxMenuButton();
         wxMenuButton.setName("上传数据");


// 设置菜单
         mpService.getMenuService().menuCreate(wxMenu);

          System.out.println(msg.getContent());
          System.out.println(msg.getFromUserName());
          return  "ok";
     }

     @RequestMapping("/sendMessage")
     String sendMessage(MessageTemplate messageTemplate,String openId) throws Exception{

         log.info("进行日报");
         mpService.getKefuService().sendKefuMessage(
                 WxMpKefuMessage
                         .TEXT()
                         .toUser(openId)
                         .content(messageTemplate.getContent())
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
