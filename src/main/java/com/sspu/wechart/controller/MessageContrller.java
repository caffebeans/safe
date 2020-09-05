package com.sspu.wechart.controller;

import com.sspu.model.WxMessage;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 14:35
 **/

@RestController
//Controllerhttp://zhang.nat100.top/wx/portal/wx63c3aeb53a76d68b
@RequestMapping("/wx/portal")
public class MessageContrller {



     @Autowired
     private WxMpService mpService;

     @PostMapping( "/{appid}")
     String getMessage(@RequestBody WxMessage msg){


          System.out.println(msg);
          return  "ok";
     }




}
