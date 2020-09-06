package com.sspu.model;

import java.util.Date;

/**
 * message_template
 */
public class MessageTemplate {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * content
     */
    private String content;

    /**
     * footer
     */
    private String footer;

    /**
     * createUserName
     */
    private String createUserName;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}