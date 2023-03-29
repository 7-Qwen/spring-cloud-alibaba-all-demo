package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 7wen
 * @Date: 2023-03-06 22:41
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulMainBoot.class, args);
    }
}
