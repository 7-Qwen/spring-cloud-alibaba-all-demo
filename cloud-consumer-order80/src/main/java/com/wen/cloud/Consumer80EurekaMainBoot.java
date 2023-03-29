package com.wen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 7wen
 * @Date: 2023-03-01 18:55
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyRule.class)
public class Consumer80EurekaMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80EurekaMainBoot.class, args);
    }
}
