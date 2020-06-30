package com.sspu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-06-24 21:00
 **/


@RestController
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



}
