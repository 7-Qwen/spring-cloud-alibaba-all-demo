package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: 7wen
 * @Date: 2023-03-23 13:24
 * @description:
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class EurekaConfigServer3344 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigServer3344.class);
    }
}
