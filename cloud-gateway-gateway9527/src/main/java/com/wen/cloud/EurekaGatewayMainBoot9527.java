package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 7wen
 * @Date: 2023-03-22 21:00
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class EurekaGatewayMainBoot9527 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaGatewayMainBoot9527.class);
    }
}
