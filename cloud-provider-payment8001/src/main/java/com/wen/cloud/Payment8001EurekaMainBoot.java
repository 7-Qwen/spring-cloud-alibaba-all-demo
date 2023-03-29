package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 7wen
 * @Date: 2023-03-01 16:31
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8001EurekaMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001EurekaMainBoot.class,args);
    }
}
