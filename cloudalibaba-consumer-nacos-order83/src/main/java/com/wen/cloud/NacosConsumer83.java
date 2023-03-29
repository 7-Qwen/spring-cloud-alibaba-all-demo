package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 7wen
 * @Date: 2023-03-28 16:00
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer83.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
