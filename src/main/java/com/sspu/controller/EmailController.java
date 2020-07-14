package com.sspu.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.sspu.service.EmailServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-06-24 17:40
 **/


@RestController
public class EmailController {

     @Autowired
     EmailServer emailServer;

   @RequestMapping("/emil/send")
   public String sendEmail(@RequestParam Map map)
   {



       System.out.println(map.get("add"));
       System.out.println(map.get("subject"));
       System.out.println(map.get("text"));
       emailServer.sendTextMail("710761875@qq.com","sspusafe热点新闻","我们已经收到了你的请求");



       return "ok";

   }

}
