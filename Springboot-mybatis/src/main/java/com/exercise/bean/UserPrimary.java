package com.exercise.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
    @author: rasa
    @date:2024/10/10下午1:56
*/
@Data
@NoArgsConstructor
public class UserPrimary {
    private Long id;

    private String name;
    private Integer age;

    public UserPrimary(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
