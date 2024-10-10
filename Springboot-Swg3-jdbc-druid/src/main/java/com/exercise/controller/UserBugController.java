package com.exercise.controller;

import com.exercise.Bean.UserBug;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/*
    @author: rasa
    @date:2024/10/10上午9:19
*/
@RestController
@RequestMapping("/usersbug")
public class UserBugController {

//    仅是自己建立，不一定符合要求
//    private Map users = new HashMap<>();

    @PostMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String postUser(@Valid @RequestBody UserBug userBug) {
//        users.put(user.getId(), user);
        return "success";
    }

}
