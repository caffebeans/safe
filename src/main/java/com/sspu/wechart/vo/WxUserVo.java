package com.sspu.wechart.vo;

import lombok.Data;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * wx_mp_user_vo
 */
@Data
public class WxUserVo {

    private Integer id;
    private String studentId;
    private String iphone;
    private String name;
    private Byte subscribe;
    private String openId;
    private String nickname;
    private String sexDesc;
    private Integer sex;
    private String language;
    private String city;
    private String province;
    private String country;
    private String headImgUrl;
    private Long subscribeTime;
    private String unionId;
    private String remark;
    private Integer groupId;
    private String subscribeScene;
    private String qrScene;
    private String qrSceneStr;

    public WxUserVo buildFromWxUserVo(WxMpUser wxMpUser) {
        this.openId=wxMpUser.getOpenId();
        this.nickname=wxMpUser.getNickname();
        this.sexDesc=wxMpUser.getSexDesc();
        this.sex=wxMpUser.getSex();
        this.language=wxMpUser.getLanguage();
        this.city=wxMpUser.getCity();
        this.province=wxMpUser.getProvince();
        this.country=wxMpUser.getCountry();
        this.headImgUrl=wxMpUser.getHeadImgUrl();
        this.subscribeScene=wxMpUser.getSubscribeScene();
        this.qrScene=wxMpUser.getQrScene();
        return this;
    }
}