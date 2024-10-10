package com.exercise.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/9下午7:36
*/
@Data
@NoArgsConstructor
public class UserMyBatis {

    private Long id;

    private String name;
    private Integer age;

    public UserMyBatis(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

