package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 7wen
 * @Date: 2023-03-28 16:39
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3377.class);
    }
}
