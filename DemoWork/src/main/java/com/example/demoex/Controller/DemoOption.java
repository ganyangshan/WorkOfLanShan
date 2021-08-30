package com.example.demoex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoOption {
    @RequestMapping("/afterlogin")
    public String Option(){
        return "option";
    }
}
