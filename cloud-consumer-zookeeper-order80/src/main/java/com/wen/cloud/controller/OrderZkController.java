package com.wen.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 7wen
 * @Date: 2023-03-06 11:07
 * @description:
 */
@RestController
@RequestMapping(value = "/zookeeper/consumer")
@Slf4j
public class OrderZkController {
    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private RestTemplate restTemplate;

    private static final String SERVICE_ID = "cloud-provider-payment";

    @PostMapping("/getHelloFromProvider")
    public String getHello(@RequestBody String msg) {
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-provider-payment");
        for (ServiceInstance instance : instances) {
            return restTemplate.postForObject("http://" + SERVICE_ID+"/zookeeper/provider/hello", msg, String.class);
        }
        return "error";
    }
}
