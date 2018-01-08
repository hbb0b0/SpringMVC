package com.maven04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class DemoController {

    @RequestMapping("/index")
    public String hello(){        
        return "index";
    }
}