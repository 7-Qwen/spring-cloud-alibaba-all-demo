package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 7wen
 * @Date: 2023-03-06 22:56
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMainBoot.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
