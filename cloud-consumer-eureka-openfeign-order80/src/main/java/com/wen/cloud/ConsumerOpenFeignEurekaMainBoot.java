package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 7wen
 * @Date: 2023-03-20 21:39
 * @description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class ConsumerOpenFeignEurekaMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenFeignEurekaMainBoot.class);
    }
}
