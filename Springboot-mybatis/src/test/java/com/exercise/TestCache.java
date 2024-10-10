package com.exercise;

import com.exercise.bean.UserMyBatis;
import com.exercise.mapper.UserMapperPrimary;
import com.exercise.service.UserServiceIPrimaryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;

/*
    @author: rasa
    @date:2024/10/10下午1:58
*/
@SpringBootTest
public class TestCache {

    @Autowired
    UserServiceIPrimaryImpl userServiceIPrimary;

    @Autowired
    UserMapperPrimary userMapperPrimary;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void testCacheable(){
        userMapperPrimary.insert("AAA", 20);
        userMapperPrimary.insert("BBB", 20);
        userServiceIPrimary.findByName("AAA");
        userServiceIPrimary.findByName("AAA");
        userServiceIPrimary.findByName("BBB");
        System.out.println(111);
    }

    @Test
    public void testCachePut(){
        userServiceIPrimary.insert("AAA", 20);
        userServiceIPrimary.insert("AAA", 20);
        userServiceIPrimary.insert("BBB", 20);
        userServiceIPrimary.insert("BBB", 20);
        System.out.println(111);
    }

    @Test
    public void testCachePut2(){
        userServiceIPrimary.insert2(new UserMyBatis("AAA", 20));
        userServiceIPrimary.insert2(new UserMyBatis("BBB", 20));
        System.out.println(111);
    }

    @Test
    public void testCacheEvict(){
        userServiceIPrimary.insert2(new UserMyBatis("AAA", 20));
        userServiceIPrimary.insert2(new UserMyBatis("BBB", 20));
        userServiceIPrimary.deleteAll();
        System.out.println(111);
    }

    @Test
    public void testCacheEvict2(){
        final UserMyBatis userMyBatis1 = userServiceIPrimary.insert2(new UserMyBatis("AAA", 20));
        final UserMyBatis userMyBatis2 = userServiceIPrimary.insert2(new UserMyBatis("BBB", 20));
        userServiceIPrimary.deleteOne(userMyBatis1.getId());
        System.out.println(111);
    }
}

