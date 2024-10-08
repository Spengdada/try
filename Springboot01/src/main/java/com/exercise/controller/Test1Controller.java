package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
    @author: rasa
    @date:2024/9/29上午9:17
*/

//@Controller
//@RequestMapping("/test1")
public class Test1Controller {

    @GetMapping("/test1")
    @ResponseBody
    public String test1() {
        return "test1";
    }

}
