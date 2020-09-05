package com.sspu.wechart.controller;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import me.chanjar.weixin.mp.bean.result.WxMpUserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 16:02
 **/

@RestController
@RequestMapping("/token")
public class TokenAuthController {

       @Autowired
       WxMpService wxMpService;


       @GetMapping("/userInfo")
       void getToken() throws Exception{

              String lang = "zh_CN"; //语言
              WxMpUser user = wxMpService.getUserService().userInfo("oOqJd6IKWw8da5aDLY4YwNQGqf1s",lang);

       }


}
