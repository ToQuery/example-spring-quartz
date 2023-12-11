package io.github.toquery.example.quartz;

import io.github.toquery.example.quartz.job.JobSpringQuartz;
import org.quartz.JobDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

@Configuration
public class QuartzSchedulerConfig {

    @Bean
    public CronTriggerFactoryBean job1Trigger(JobDetail jobDetail) {
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        cronTriggerFactoryBean.setJobDetail(jobDetail);
        cronTriggerFactoryBean.setCronExpression("0/15 * * * * ?");
        return cronTriggerFactoryBean;
    }

    @Bean
    public JobDetailFactoryBean job1Detail() {
        JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
        jobDetailFactoryBean.setJobClass(JobSpringQuartz.class);
        jobDetailFactoryBean.setDurability(true);
        return jobDetailFactoryBean;
    }
}
