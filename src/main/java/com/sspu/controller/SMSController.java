package com.sspu.controller;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-06-30 01:20
 **/


@Controller
@RequestMapping("/message")
public class SMSController {



    @RequestMapping("/send")
    public  void testSendTemplateSMS() {

        String accesskeyId = "LTAI22CJovm4GdPD";
        String accessKeySecret="ZPGVDjqcWLmBaOpTXnkvSuAroCQbAw";
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",accesskeyId , accessKeySecret);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", "18435205208");
        request.putQueryParameter("SignName", "校园防疫");
        request.putQueryParameter("TemplateCode", "SMS_175581900");
        request.putQueryParameter("TemplateParam", "{\"code\":\"06\"}");

        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
    }



