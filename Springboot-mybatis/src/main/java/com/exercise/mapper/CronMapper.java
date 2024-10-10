package com.exercise.mapper;

/*
    @author: rasa
    @date:2024/10/10下午3:24
*/
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface CronMapper {
    @Select("select cron from scheduled where id=#{id}")
    String getCron(Long id);
}

