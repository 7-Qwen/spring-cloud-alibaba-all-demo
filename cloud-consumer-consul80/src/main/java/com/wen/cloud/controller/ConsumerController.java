package com.wen.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
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
 * @Date: 2023-03-06 22:57
 * @description:
 */
@RestController
@RequestMapping("/consul/consumer")
@Slf4j
public class ConsumerController {
    private final String url = "http://cloud-provider-consul";

    @Value("${server.port}")
    private String port;

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "getHello")
    public String getProvider(@RequestBody String msg) {
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-provider-consul");
        for (ServiceInstance instance : instances) {
            log.info("instanceId:"+instance.getInstanceId()+
                    "---host:"+instance.getHost()+
                    "---uri:"+instance.getUri()+
                    "---scheme"+instance.getScheme());
        }
        return restTemplate.postForObject(url + "/consul/provider/getHello", msg, String.class);
    }
}
