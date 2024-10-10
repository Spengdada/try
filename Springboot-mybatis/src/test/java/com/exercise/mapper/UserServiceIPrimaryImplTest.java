package com.exercise.mapper;

import com.exercise.bean.UserMyBatis;
import com.exercise.service.UserServiceIPrimaryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
    @author: rasa
    @date:2024/10/10下午2:07
*/
@SpringBootTest
public class UserServiceIPrimaryImplTest {

    @Autowired
    UserServiceIPrimaryImpl userServiceIPrimaryImpl;

    @Test//可以回滚
    public void testAddTwo(){
        userServiceIPrimaryImpl.addTwo(new UserMyBatis("aaa", 20),
                new UserMyBatis("vvvv", 22));
    }
}

