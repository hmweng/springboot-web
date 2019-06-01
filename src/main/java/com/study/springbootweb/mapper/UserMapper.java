package com.study.springbootweb.mapper;

import com.study.springbootweb.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User queryUserBYId(Long id);

    List<User> queryAll();

}
