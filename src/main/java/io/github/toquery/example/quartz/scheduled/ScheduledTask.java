package io.github.toquery.example.quartz.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {


    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Integer count = 1;


    @Scheduled(cron = "0/5 * * * * ?")
    public void reportCurrentTime() throws InterruptedException {
        System.out.println(String.format(" reportCurrentTime 第 %s 次执行，当前时间为：%s", count++, dateFormat.format(new Date())));
    }

}
