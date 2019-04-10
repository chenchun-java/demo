package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping({"/","/index.html"})
    public String index(){
        System.out.println("12334355");
        return "index";
    }
}
