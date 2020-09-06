package com.sspu.wechart.vo;

import lombok.Data;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-06 19:26
 **/

@Data
public class WxMpUserVo{

        private Integer id;
        private String studentId;
        private String iphone;
        private String name;
        private Boolean subscribe;
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
        private Long[] tagIds;
        private String[] privileges;
        private String subscribeScene;
        private String qrScene;
        private String qrSceneStr;
        private Integer isSafe;

}
