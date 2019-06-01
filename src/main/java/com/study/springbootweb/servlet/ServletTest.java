package com.study.springbootweb.servlet;

import org.springframework.boot.configurationprocessor.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ServletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html");
//        response.setHeader("Access-Control-Allow-Origin", "*");

        System.out.println("servletTest请求");

//        PrintWriter out = response.getWriter();
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", 100);
//        map.put("message", "ok");
//        out.write(map.toString());
//        out.flush();
//        out.close();
    }

}
