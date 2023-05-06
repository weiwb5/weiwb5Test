package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {
    @RequestMapping(value = "/springboot/say")
    public @ResponseBody String say(){
        return "你好，springboot!";
    }
    
}
