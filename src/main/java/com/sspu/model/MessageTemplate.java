package com.sspu.model;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-06 02:16
 **/

@Data
public class MessageTemplate {

    private Integer id;
    private String name;
    private String content;
    private String footer;
    private String createUserName;
    private Date createTime;




}
