package com.study.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * ImportResource 引入xml配置文件，让springboot解析
 */
@SpringBootApplication
@ImportResource(value = "classpath:spring/spring-bean.xml")
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

}
