package com.sspu.model;

import lombok.Data;

import java.util.Date;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 16:51
 **/


@Data
public class Admin {

      private Integer id;
      private String userName;
      private String password;
      private String imgUrl;
      private String iphone;
      private Date createTime;

}
