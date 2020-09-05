package com.sspu.controller.admin;

import com.alibaba.fastjson.JSON;
import com.sspu.model.SysAdmin;
import com.sspu.service.SysAdminService;
import com.sspu.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @des: 管理员登陆
 * @author: zhangliang
 * @create: 2020-09-05 16:29
 **/


@Controller
@Slf4j
@CrossOrigin
public class LoginController {


     @Autowired
     SysAdminService sysAdminService;

   @RequestMapping("/admin/login")
   @ResponseBody
   public ResultVO login(@RequestBody Map map){


          log.info("用户后台管理登录");
          ResultVO resultVO = new ResultVO();
          SysAdmin sysAdmin = sysAdminService.selectByUserNameAndPassword(map);
          if (sysAdmin==null){
                     resultVO.setCode(1000);
                     resultVO.setMsg("用户或者密码不正确");
              return resultVO;
          }

           resultVO.setMsg("ok");
           resultVO.setCode(200);

          return resultVO;
   }


}
