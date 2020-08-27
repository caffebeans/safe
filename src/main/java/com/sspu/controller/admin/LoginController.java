package com.sspu.controller.admin;

import com.alibaba.fastjson.JSON;
import com.sspu.model.New;
import com.sspu.vo.ResultVO;
import netscape.javascript.JSObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-08-06 16:10
 **/

@Controller
public class LoginController {


    @RequestMapping("/admin/login")
    @ResponseBody
    String login(@RequestBody New news){

        System.out.println(news.getAuthor());

        return "ok";
    }

}




