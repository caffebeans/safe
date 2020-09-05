package com.sspu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @des: index.html
 * @author: zhangliang
 * @create: 2020-07-14 14:33
 **/

@Controller
@Slf4j
public class IndexController {

         @RequestMapping("/")
         String index(){
             log.info("获取主页");
             return "index";
         }


}
