package com.ls.boot.config;

import com.ls.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//告诉SpringBoot这是一个配置类=配置文件
public class Myconfig {
    @Bean("Tom")//给容器添加组件，方法名就是组件id,返回类型就是组件类型，返回是值就是组件在容器中的实例
    public User user01(){
        return new User("li",20);
    }
}
