package com.exercise.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
    @author: rasa
    @date:2024/9/29上午9:35
*/
@Component
@ConfigurationProperties(prefix = "book")//此注解用于将配置文件中的属性绑定到Book类中
@Data
public class Book {

//    @Value("${book.name}")
    private String name;
//    @Value("${book.author}")
    private String author;
}
