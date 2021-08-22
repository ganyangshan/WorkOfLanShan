package com.ls.boot;

import com.ls.boot.bean.User;
import com.ls.boot.controller.hellocon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
/**
 *@SpringBootApplication： 这是一个springBoot应用
 */
public class Domain1 {
    public static void main(String[] args) {
        //运行SpringBoot应用，传入运行主类和args
        ConfigurableApplicationContext run = SpringApplication.run(hellocon.class, args);



    }
}
