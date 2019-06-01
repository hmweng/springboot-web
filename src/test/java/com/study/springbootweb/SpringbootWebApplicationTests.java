package com.study.springbootweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        System.out.println(applicationContext);
        System.out.println(applicationContext.getBean("helloService"));
        System.out.println(applicationContext.getBean("hello"));
    }

    @Test
    public void testLog(){
        Logger logger = LoggerFactory.getLogger(SpringbootWebApplication.class);
        logger.info("hello world,{},{}", "aaa", "bbb");
    }

}
