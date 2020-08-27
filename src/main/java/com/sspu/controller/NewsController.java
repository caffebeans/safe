package com.sspu.controller;

import com.sspu.model.New;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-06-24 21:00
 **/


@RestController("news")
@CrossOrigin
public class NewsController {


    @RequestMapping("/list")
    public List<String >  list(){

        System.out.println("dddddd");

         List list = new ArrayList();
         list.add("12");
         list.add("12");
         list.add("12");
         list.add("12");
         list.add("12");
         list.add("12");


         return list;
     }


      @RequestMapping("add")
      @ResponseBody
      Object add(@RequestBody New news){

        System.out.println(news.getAuthor());

        return null;
      }

}
