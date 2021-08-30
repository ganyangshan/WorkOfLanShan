package com.example.demoex.Ser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootApplication
@ServletComponentScan   //启动器启动时，扫描本目录以及子目录带有的webservlet注解的
public class ServletTest {

    public static void main(String[] args) {
        SpringApplication.run(ServletTest.class, args);
    }
}
