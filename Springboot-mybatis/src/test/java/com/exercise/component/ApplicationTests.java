package com.exercise.component;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
    @author: rasa
    @date:2024/10/10下午3:30
*/
@Slf4j
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private AsyncTasks asyncTasks;


    // 测试同步方法
    @Test
    public void test() throws Exception {
        asyncTasks.doTaskOne();
        asyncTasks.doTaskTwo();
        asyncTasks.doTaskThree();
    }

}

