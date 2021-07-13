package com.example.selectshopproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing //타임스탬프 기능 설정
@SpringBootApplication
public class SelectshopProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SelectshopProjectApplication.class, args);
    }

}
