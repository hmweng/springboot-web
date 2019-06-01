package com.study.springbootweb.config;

import com.study.springbootweb.filter.FilterTest;
import com.study.springbootweb.listener.ListenerTest;
import com.study.springbootweb.servlet.ServletTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
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
     * Servlet组件
     * @return
     */
    @Bean
    public ServletRegistrationBean sessionHandlerInterceptor(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new ServletTest(),"/servletTest");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<FilterTest> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new FilterTest());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        return new ServletListenerRegistrationBean<>(new ListenerTest());
    }

}
