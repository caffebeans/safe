package com.sspu.wechart.vo;

import lombok.Data;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * wx_mp_user_vo
 */

@Data
public class WxUserVo {
    /**
     * id
     */
    private Integer id;

    /**
     * openId
     */
    private String openId;

    /**
     * studentId
     */
    private String studentId;

    /**
     * iphone
     */
    private String iphone;

    /**
     * name
     */
    private String name;

    /**
     * subscribe
     */
    private Byte subscribe;

    /**
     * nickname
     */
    private String nickname;

    /**
     * sexDesc
     */
    private String sexDesc;

    /**
     * sex
     */
    private Integer sex;

    /**
     * language
     */
    private String language;

    /**
     * city
     */
    private String city;

    /**
     * province
     */
    private String province;

    /**
     * country
     */
    private String country;

    /**
     * headImgUrl
     */
    private String headImgUrl;

    /**
     * subscribeTime
     */
    private Long subscribeTime;

    /**
     * unionId
     */
    private String unionId;

    /**
     * remark
     */
    private String remark;

    /**
     * groupId
     */
    private Integer groupId;

    /**
     * subscribeScene
     */
    private String subscribeScene;

    /**
     * qrScene
     */
    private String qrScene;

    /**
     * qrSceneStr
     */
    private String qrSceneStr;



    public WxUserVo buildFromWxUserVo(WxMpUser wxMpUser) {
        this.openId = wxMpUser.getOpenId();
        this.nickname = wxMpUser.getNickname();
        this.sexDesc = wxMpUser.getSexDesc();
        this.sex = wxMpUser.getSex();
        this.language = wxMpUser.getLanguage();
        this.city = wxMpUser.getCity();
        this.province = wxMpUser.getProvince();
        this.country = wxMpUser.getCountry();
        this.headImgUrl = wxMpUser.getHeadImgUrl();
        this.subscribeScene = wxMpUser.getSubscribeScene();
        this.qrScene = wxMpUser.getQrScene();
        return this;
    }
}