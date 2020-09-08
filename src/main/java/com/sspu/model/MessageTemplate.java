package com.sspu.model;

import java.util.Date;
import lombok.Data;

/**
 * message_template
 */
@Data
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
}