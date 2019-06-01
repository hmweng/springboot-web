package com.study.springbootweb.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@MapperScan(value = "com.study.springbootweb.mapper")
public class DataSourceConfig {

    @Autowired
    private Environment environment;

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DruidDataSource druidDataSource(){
        /*
        第一种方式获取不到参数，第二种可以获取到对应的值
        environment.getProperty("url");
        environment.getProperty("spring.datasource.url");*/
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

}
