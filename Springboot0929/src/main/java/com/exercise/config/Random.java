package com.exercise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
    @author: rasa
    @date:2024/9/29上午10:31
*/
@Component
@ConfigurationProperties(prefix = "rand")
@Data
public class Random {
    private String aaa;

    private int bbb;

    private int ccc;

    private int ddd;
}
