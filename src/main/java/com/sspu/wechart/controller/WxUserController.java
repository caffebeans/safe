package com.sspu.wechart.controller;

import com.sspu.vo.ResultVO;
import com.sspu.wechart.WxUser;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.service.WxService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import me.chanjar.weixin.mp.bean.result.WxMpUserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @des: 获取用户列表
 * @author: zhangliang
 * @create: 2020-09-06 00:22
 **/

@RestController
@RequestMapping("/wx/user")
@Slf4j
public class WxUserController {

       @Autowired
       WxMpService wxMpService;

       @RequestMapping("/list")
       ResultVO list() throws Exception{

          List<WxMpUser> wxUsers=new ArrayList<>();
          String lang = "zh_CN"; //语言
          ResultVO resultVO = new ResultVO();
          WxMpUserList wxUserList = wxMpService.getUserService().userList(null);
          List<String> openids = wxUserList.getOpenids();
          for(String id:openids){
              WxMpUser user = wxMpService.getUserService().userInfo(id,lang);
              wxUsers.add(user);
          }
          resultVO.setData(wxUsers);
          resultVO.setCode(200);
          return resultVO;
      }




}
