package com.exercise.mapper;

import com.exercise.bean.UserMyBatis;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/*
    @author: rasa
    @date:2024/10/9下午7:37
*/
@Mapper
public interface UserMyBatisMapper {

    @Select("SELECT * FROM USERMYBATIS WHERE NAME = #{name}")
    UserMyBatis findByName(@Param("name") String name);

    @Insert("INSERT INTO USERMYBATIS(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Insert("INSERT INTO USERMYBATIS(NAME, AGE) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("INSERT INTO USERMYBATIS(NAME, AGE) VALUES(#{name}, #{age})")
    int insertByUser(UserMyBatis user);




}

