package com.wen.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 7wen
 * @Date: 2023-03-20 21:58
 * @description:
 */
@Configuration
public class FeignLogConfig {
    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
}
