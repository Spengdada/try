package com.exercise.component;

import com.exercise.mapper.CronMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

/*
    @author: rasa
    @date:2024/10/10下午3:25
*/
@Component
@EnableScheduling //开启定时任务
public class ScheduleTask implements SchedulingConfigurer {
    @Autowired
    private CronMapper cronMapper;
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.addTriggerTask(
                //添加任务内容
                () -> process(),
                //设置执行的周期
                triggerContext -> {
                    //查询cron表达式
                    String cron = cronMapper.getCron(1L);
                    if (cron.isEmpty()) {
                        System.out.println("cron is null");
                    }
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                });
    }
    private void process() {
        System.out.println("基于接口的定时任务");
    }
}
