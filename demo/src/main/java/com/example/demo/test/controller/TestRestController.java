package com.example.demo.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping(value="testValue", method = RequestMethod.GET)
    public String getTestValue(){
        String TestValue = "레스트 컨트롤러 잘 가니?";
        return TestValue;
    }
    
}