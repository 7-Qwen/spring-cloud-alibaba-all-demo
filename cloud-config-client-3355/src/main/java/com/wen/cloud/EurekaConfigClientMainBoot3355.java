package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 7wen
 * @Date: 2023-03-23 13:42
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaConfigClientMainBoot3355 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClientMainBoot3355.class);
    }
}
