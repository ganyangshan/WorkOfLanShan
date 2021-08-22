package com.ls.boot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController//是@ResponseBody和@Controller的结合
public class hellocon {
    @RequestMapping("/hello")
    public String handle01(){
        return "hello,springboot!";
        //返回给浏览器的内容
    }

    public static void main(String[] args) {
        SpringApplication.run(hellocon.class, args);
    }
}
