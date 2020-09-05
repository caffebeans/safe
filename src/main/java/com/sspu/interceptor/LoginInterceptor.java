package com.sspu.interceptor;

import com.sspu.model.SysAdmin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 22:23
 **/


@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("拦截器开始工作"+"请求的路径是"+request.getRequestURL());
        SysAdmin user = (SysAdmin) request.getSession().getAttribute("user");
        if (user==null){

            log.info("用户没有登陆");
            response.sendRedirect("/admin/login");
        }

        return true;
    }
}
