package com.wen.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 7wen
 * @Date: 2023-03-01 19:00
 * @description:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
