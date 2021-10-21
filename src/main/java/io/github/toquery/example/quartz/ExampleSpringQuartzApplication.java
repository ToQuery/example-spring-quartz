package io.github.toquery.example.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

// @EnableScheduling
@SpringBootApplication
public class ExampleSpringQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleSpringQuartzApplication.class, args);
    }

}
