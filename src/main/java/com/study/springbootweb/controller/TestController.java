package com.study.springbootweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("hello")
    public String hello(Integer code) throws Exception {
        if (code != null) {
            if (code == 1) {
                throw new RuntimeException("runtime异常");
            } else if (code == 2) {
                throw new Exception("exception异常");
            }
        }
        logger.info("打印日志");
        return "hello world";
    }

}
