package com.exercise.controller;

import com.exercise.Bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/*
    @author: rasa
    @date:2024/9/29下午2:19
*/
@RestController
@Slf4j
public class TestParamController {

    @GetMapping("/test1")
    public String testParam1(Integer id,
                             String name,
                             Boolean gender,
                             @DateTimeFormat(pattern = "yyyy-MM-dd")
                             Date birth) {
        log.info("test param1");
        log.info("id:" + id);
        log.info("name:" + name);
        log.info("gender:" + gender);
        log.info("birth:" + birth);
        return "success";
    }

    @GetMapping("/test2")
    public String testParam2(User user){
        log.info("test param2");
        log.info("user:"+user);
        return "success";
    }



}
