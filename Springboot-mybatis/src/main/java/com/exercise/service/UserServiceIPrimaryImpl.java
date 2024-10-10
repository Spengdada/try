package com.exercise.service;

import com.exercise.bean.UserMyBatis;
import com.exercise.bean.UserPrimary;
import com.exercise.mapper.UserMapperPrimary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/10下午1:42
*/
@Service
@CacheConfig(cacheNames = "users")
public class UserServiceIPrimaryImpl {


    @Autowired
    private UserMapperPrimary userMapperPrimary;

        @Cacheable
    public List<UserPrimary> findByName(String name){
        return userMapperPrimary.findByName(name);
    }


        @CachePut
    public int insert(String name,Integer age){
        return userMapperPrimary.insert(name, age);
    }

        @CachePut(key="#p0.id")
    public UserMyBatis insert2(UserMyBatis userMyBatis){
        userMapperPrimary.insert2(userMyBatis);
        return userMyBatis;
    }

        @CacheEvict(allEntries=true)
    public  int deleteAll(){
        return userMapperPrimary.deleteAll();
    }

        @CacheEvict
    public  int deleteOne(Long id){
        return userMapperPrimary.deleteOne(id);
    }



    @Transactional
    public void addTwo(UserMyBatis userMyBatis1, UserMyBatis userMyBatis2){
        userMapperPrimary.insert(userMyBatis1.getName(),userMyBatis1.getAge());
        userMapperPrimary.insert(userMyBatis2.getName(),userMyBatis2.getAge());
    }
}

