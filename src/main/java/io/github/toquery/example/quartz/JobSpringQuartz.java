package io.github.toquery.example.quartz;

import lombok.extern.slf4j.Slf4j;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Slf4j
//@PersistJobDataAfterExecution
@DisallowConcurrentExecution
@Component
public class JobSpringQuartz extends QuartzJobBean implements Job {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(" Job Spring Quartz ");
    }
}