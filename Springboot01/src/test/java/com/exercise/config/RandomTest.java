package com.exercise.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/*
    @author: rasa
    @date:2024/9/29上午10:32
*/
@SpringBootTest
@Slf4j
public class RandomTest {
    @Resource
    private Random random;

    @Test
    public void testRandomConfig(){
        log.info("random is {}",random);
    }
}
