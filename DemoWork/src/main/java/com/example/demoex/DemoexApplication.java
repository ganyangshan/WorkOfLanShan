package com.example.demoex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//该注解会扫描相应的包
@ServletComponentScan
@SpringBootApplication
public class DemoexApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoexApplication.class, args);
    }

}
