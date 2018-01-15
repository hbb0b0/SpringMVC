package com.maven01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maven01.dto.*;
@Controller
@RequestMapping("/mvc")
public class DemoController {

    @RequestMapping("/index")
    public String hello(){        
        return "index";
    }
    
   
    @RequestMapping(method=RequestMethod.GET, value="/getUser",produces="application/json")
    public @ResponseBody List<UserDto> getUser(){        
    	
    	ArrayList<UserDto> resultList=new ArrayList<UserDto>();
    	for(int i=0;i<100;i++)
    	{
            UserDto user=new UserDto(i,String.format("hbb0b0-%s", i+""));
            resultList.add(user);
    	}
        return resultList;
    }
    
}