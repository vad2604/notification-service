package com.example.emailnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmailNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailNotificationApplication.class, args);
    }

}
