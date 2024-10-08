package com.exercise.config;

/*
    @author: rasa
    @date:2024/9/29上午9:43
*/

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class BookTest {

    @Resource
    private Book book;

    @Test
    public void test() {
        log.info("book = {}",book);
    }
}
