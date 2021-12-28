package com.example.demo.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{
    @RequestMapping(value = "/home") 
    public String home(){ 
        return "index.html"; 
    }
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "csy"); 
        List<String> testList = new ArrayList<String>(); 
        testList.add("choi"); 
        testList.add("seong"); 
        testList.add("yun"); 
        mav.addObject("list", testList); 
        return mav; 
    }

}