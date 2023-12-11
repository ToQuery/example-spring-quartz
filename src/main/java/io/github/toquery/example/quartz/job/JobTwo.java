package io.github.toquery.example.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.stereotype.Component;
@Slf4j
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Component
public class JobTwo implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDataMap data = context.getTrigger().getJobDataMap();
        String invokeParam = (String) data.get("invokeParam");
        //在这里实现业务逻辑
        log.info(" Job Two invokeParam : {} ", invokeParam);
    }
}
