package com.example.smsnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmsNotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsNotificationApplication.class, args);
    }

}
