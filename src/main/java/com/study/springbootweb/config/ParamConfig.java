package com.study.springbootweb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 将配置文件内的属性注入到实体类内示例
 * ConfigurationProperties注解说明：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 * PropertySource指明参数的配置文件的路径
 */
@Component
@PropertySource("classpath:config/param-config.properties")
@ConfigurationProperties(prefix = "config")
public class ParamConfig {

    private Integer num;

    private Boolean isStart;

    private String name;

    private List<Integer> typeList;

    private Map<String, Object> map;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Boolean getStart() {
        return isStart;
    }

    public void setStart(Boolean start) {
        isStart = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<Integer> typeList) {
        this.typeList = typeList;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ParamConfig{" +
                "num=" + num +
                ", isStart=" + isStart +
                ", name='" + name + '\'' +
                ", typeList=" + typeList +
                ", map=" + map +
                '}';
    }
}
