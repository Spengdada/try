package com.exercise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
    @author: rasa
    @date:2024/9/29上午9:41
*/
@Configuration
@ConfigurationProperties(prefix = "environments")
@Data
public class Environments {

    private Dev dev;

    private Prod prod;

    //可使用静态内部类
    @Data
    public static class Dev{
        private String url;

        private String name;
    }

    @Data
    public static class Prod{
        private String url;

        private String name;
    }
}
