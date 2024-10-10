package com.exercise.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    @author: rasa
    @date:2024/10/10下午3:17
*/
@Component
@Slf4j
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("现在时间：" + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0/3 * * * * *")
    public void reportCurrentTime2() {
        log.info("现在时间2：" + dateFormat.format(new Date()));
    }
}

