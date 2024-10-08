package com.exercise.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/*
    @author: rasa
    @date:2024/9/29上午9:54
*/
@SpringBootTest
@Slf4j
public class EnvironmentsTest {

    @Resource
    private com.exercise.config.Environments env;

    @Test
    public void test() {
        log.info("env = {}",env);
    }
}
