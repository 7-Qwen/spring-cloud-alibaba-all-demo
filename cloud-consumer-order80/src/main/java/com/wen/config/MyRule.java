package com.wen.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 7wen
 * @Date: 2023-03-20 19:34
 * @description:
 */
@Configuration
public class MyRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
