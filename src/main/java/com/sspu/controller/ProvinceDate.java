package com.sspu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.JsonObject;
import com.sspu.vo.ProvinceVo;
import com.sspu.vo.ResultVO;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @des:用来获取新冠肺炎的接口
 * @author: zhangliang
 * @create: 2020-08-27 19:56
 **/

@RestController
public class ProvinceDate {






     @RequestMapping("/getProvinceDate")
     ResultVO getProvinceDate() throws Exception{

         CloseableHttpClient httpclient = HttpClients.createDefault();
         HttpGet httpget = new HttpGet("https://lab.isaaclin.cn/nCoV/api/area");
         HttpResponse response = httpclient.execute(httpget);
         HttpEntity entity = response.getEntity();
         String strResult = EntityUtils.toString(response.getEntity());

         JSON json = (JSON) JSON.parse(strResult);
         System.out.println(json.toString());

         JSON.parseArray(strResult, ProvinceVo.class);

   //      JSONArray objects = JSON.parseArray(strResult);
//         for (int i = 0; i <objects.size() ; i++) {
//
//              System.out.println(objects.get(i));
//             objects.get(i);
//
//         }



        // System.out.println(objects.get(1));


         return new ResultVO();
    }

}
