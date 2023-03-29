package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 7wen
 * @Date: 2023-03-02 16:25
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002Boot {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002Boot.class, args);
    }
}
