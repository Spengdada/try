package com.exercise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/*
    @author: rasa
    @date:2024/9/29上午10:50
*/
@Component
@ConfigurationProperties(prefix = "my-example")
@Data
public class MyExample {

    private List<String> url;

    private Map<String,String> auth;
}
