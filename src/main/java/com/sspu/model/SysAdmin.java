package com.sspu.model;

import java.util.Date;

/**
    * admin
    */
public class SysAdmin {
    /**
    * id
    */
    private Integer id;

    /**
    * userName
    */
    private String userName;

    /**
    * password
    */
    private String password;

    /**
    * imgUrl
    */
    private String imgUrl;

    /**
    * iphone
    */
    private String iphone;

    /**
    * createTime
    */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}