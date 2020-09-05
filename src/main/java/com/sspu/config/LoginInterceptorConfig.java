package com.sspu.config;

import com.sspu.interceptor.LoginInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @des:
 * @author: zhangliang
 * @create: 2020-09-05 22:36
 **/


@Slf4j

public class LoginInterceptorConfig implements WebMvcConfigurer {


       @Autowired
       LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

            log.info("开始进行登陆拦截");
            registry.addInterceptor((HandlerInterceptor) loginInterceptor).addPathPatterns("/**")
                    .excludePathPatterns("/")
                    .excludePathPatterns("/templates")
                    .excludePathPatterns("/**.html")
                    .excludePathPatterns("/assets/**")
                    .excludePathPatterns("/wx/**")
                    .excludePathPatterns("/admin/login");

    }


}
