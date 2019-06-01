package com.study.springbootweb;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@ResponseBody
public class ExceptionControllerHandle {

    @ExceptionHandler(RuntimeException.class)
    public Map<String,Object> runtimeException(RuntimeException e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message", e.getMessage());
        return map;
    }

    @ExceptionHandler(Exception.class)
    public Map<String,Object> rexception(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message", e.getMessage());
        return map;
    }

}
