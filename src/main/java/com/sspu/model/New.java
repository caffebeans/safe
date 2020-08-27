package com.sspu.model;

import lombok.Data;

import java.sql.Time;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-06-24 21:43
 **/


@Data
public class New {

     private Integer  id;
     private String   title;
     private String   author;
     private String   time;
     private Integer  comments;
     private String   text;
     private String   content;
     private String   url;
     private String   type;
     private String   from;
     private Integer  alive;




}
