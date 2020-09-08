package com.sspu.wechart.controller;

import com.sspu.vo.ResultVO;
import com.sspu.wechart.service.WxUserVoService;
import com.sspu.wechart.vo.WxUserVo;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.service.WxService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import me.chanjar.weixin.mp.bean.result.WxMpUserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

       @Autowired
       WxUserVoService wxUserVoService;


    /**
     *
     * @des: 这个是从微信平台调用接口
     * @throws Exception
     */
       @RequestMapping("/list")
       ResultVO list() throws Exception{

           ResultVO resultVO = new ResultVO();
           System.out.println("查询本地数据库所有用户记消息");
     try{
         List<WxUserVo> list = wxUserVoService.findAll();
         System.out.println("ddddd");
         System.out.println(list.size());
         if (null!=list){
             resultVO.sucesss(list);
             return resultVO;
         }
    }catch(Exception e){
        e.printStackTrace();
    }
          resultVO.setCode(2002);
          resultVO.setMsg("获取用户失败");
          return resultVO;
      }


    /**
     *
      * @des： 这个是向我们的数据库去查询数据
     * @throws Exception
     */
    @RequestMapping("/all")
    ResultVO all() throws Exception{

        System.out.println("查询所有用记消息");
        log.info("查询用户所有的信息--------------------");
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
