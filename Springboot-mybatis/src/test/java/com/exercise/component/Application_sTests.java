package com.exercise.component;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CompletableFuture;

/*
    @author: rasa
    @date:2024/10/10下午3:30
*/
@Slf4j
@SpringBootTest
public class Application_sTests {

    @Autowired
    private AsyncTasks_s asyncTasks_s;


    // 测试同步方法
    @Test
    public void test() throws Exception {
        long start = System.currentTimeMillis();

        CompletableFuture<String> task1 = asyncTasks_s.doTaskOne();
        CompletableFuture<String> task2 = asyncTasks_s.doTaskTwo();
        CompletableFuture<String> task3 = asyncTasks_s.doTaskThree();

        CompletableFuture.allOf(task1, task2, task3).join();

        long end = System.currentTimeMillis();

        log.info("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }

}

