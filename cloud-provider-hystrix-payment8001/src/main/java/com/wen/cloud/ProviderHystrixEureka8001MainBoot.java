package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author: 7wen
 * @Date: 2023-03-21 20:37
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class ProviderHystrixEureka8001MainBoot {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixEureka8001MainBoot.class);
    }
}
