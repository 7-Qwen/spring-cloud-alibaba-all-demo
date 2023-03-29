package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 7wen
 * @Date: 2023-03-28 15:34
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001.class);
    }
}
