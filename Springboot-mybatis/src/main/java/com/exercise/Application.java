package com.exercise;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
    @author: rasa
    @date:2024/10/9下午7:38
*/
@SpringBootApplication
@EnableCaching
@EnableScheduling
@EnableAsync
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        log.error("Hello World");
        log.warn("Hello World");
        log.info("Hello World");
        log.debug("Hello World");
        log.trace("Hello World");


    }
}

