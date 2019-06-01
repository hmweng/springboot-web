package com.study.springbootweb.config;

import com.study.springbootweb.interceptor.SessionHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 配置类
 * 指明当前类是一个配置类；就是来替代之前的Spring配置文件
 */
@Configuration
public class WebConfig {

    /**
     * @Bean注解：给容器中添加组件
     * @return
     */
    /*@Bean
    public SessionHandlerInterceptor sessionHandlerInterceptor(){
        return new SessionHandlerInterceptor();
    }*/



}
