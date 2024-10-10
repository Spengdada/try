package com.exercise.mapper;

import com.exercise.bean.UserMyBatis;
import com.exercise.bean.UserPrimary;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/10下午1:55
*/
@Mapper
public interface UserMapperPrimary {


    @Select("SELECT * FROM usermybatis WHERE NAME = #{name}")
    List<UserPrimary> findByName(@Param("name") String name);


    @Insert("INSERT INTO usermybatis(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    @Insert("INSERT INTO usermybatis(NAME, AGE) VALUES(#{name}, #{age})")
    int insert2(UserMyBatis userMyBatis);

    @Delete("DELETE FROM usermybatis")
    int deleteAll();

    @Delete("DELETE FROM usermybatis where id = #{id}")
    int deleteOne(Long id);

}

