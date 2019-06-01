package com.study.springbootweb.controller;

import com.study.springbootweb.entity.User;
import com.study.springbootweb.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("hello")
    public String hello(Integer code) throws Exception {
        User user = userMapper.queryUserBYId(1L);
        System.out.println(user.toString());

        List<User> users = userMapper.queryAll();
        return "hello world";
    }

}
