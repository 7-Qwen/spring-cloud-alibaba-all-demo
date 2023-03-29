package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 7wen
 * @Date: 2023-03-23 13:51
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaConfigClient3366 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClient3366.class);
    }
}
