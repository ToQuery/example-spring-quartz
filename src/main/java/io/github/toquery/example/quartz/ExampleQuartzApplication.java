package io.github.toquery.example.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;

// @EnableScheduling
@SpringBootApplication
public class ExampleQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleQuartzApplication.class, args);
    }

}
