package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 7wen
 * @Date: 2023-03-06 10:21
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderZookeeperMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(ProviderZookeeperMainBoot.class, args);
    }
}
