package com.exercise.controller;

import com.exercise.Bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/*
    @author: rasa
    @date:2024/9/29下午6:59
*/
@Controller
@Slf4j
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/test1")
    @ResponseBody //将handler的返回值，转换成json(jackson),并将json响应给客户端。
    public User test1(){
        return new User(1,"aaa",new Date(),false);
    }
    // @ResponseBody还可以用在handler的返回值上
    @RequestMapping("/test2")
    public @ResponseBody List<User> test2(){
        return List.of(
                new User(1, "aaa", new Date(), true),
                new User(2, "bbb", new Date(), false),
                new User(3, "ccc", new Date(), true)
        );
    }
    // 如果返回值已经是字符串，则不需要转json，直接将字符串响应给客户端
    @RequestMapping(value="/test3")
    @ResponseBody
    public String test3(){
        return "你好";
    }

    @PostMapping("/users")
    @ResponseBody
    public String addUser(@RequestBody User user){//@RequestBody将请求体中的json数据转换为java对象
        log.info("Post user :"+user);
        return "success";
    }

    @GetMapping("/users/1")
    public User queryOne(){
        return new User(1, "aaa", new Date(), true);
    }

}
