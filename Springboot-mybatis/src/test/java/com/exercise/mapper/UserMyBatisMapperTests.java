package com.exercise.mapper;

import com.exercise.bean.UserMyBatis;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.HashMap;
import java.util.Map;

/*
    @author: rasa
    @date:2024/10/9下午7:45
*/
@Slf4j
@SpringBootTest
public class UserMyBatisMapperTests {

    @Autowired
    private UserMyBatisMapper userMapper;

    @Test
    @Rollback
    public void test() throws Exception {
        userMapper.insert("AAA", 20);
        UserMyBatis u = userMapper.findByName("AAA");
        Assertions.assertEquals(20, u.getAge().intValue());

        Map<String, Object> map = new HashMap<>();
        map.put("name", "CCC");
        map.put("age", 40);
        userMapper.insertByMap(map);


    }



}


