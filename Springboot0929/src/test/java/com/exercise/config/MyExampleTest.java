package com.exercise.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/*
    @author: rasa
    @date:2024/9/29上午10:53
*/
@SpringBootTest
@Slf4j
public class MyExampleTest {
    @Resource
    private MyExample myExample;

//    注意Test的包
    @Test
    public void test(){
        log.info("myExample: {}", myExample);
    }

}
