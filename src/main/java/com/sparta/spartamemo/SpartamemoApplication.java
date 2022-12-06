package com.sparta.spartamemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpartamemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpartamemoApplication.class, args);
    }

}
