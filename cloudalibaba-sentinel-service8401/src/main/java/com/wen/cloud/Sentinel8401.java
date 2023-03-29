package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 7wen
 * @Date: 2023-03-28 17:41
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Sentinel8401 {
    public static void main(String[] args) {
        SpringApplication.run(Sentinel8401.class);
    }
}
