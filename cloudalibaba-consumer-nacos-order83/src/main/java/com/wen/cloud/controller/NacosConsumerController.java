package com.wen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-28 16:01
 * @description:
 */
@RestController
@RequestMapping(value = "/consumer")
public class NacosConsumerController {
    @Value("${service-url.nacos-user-service}")
    private String uri;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/test/{id}")
    public String getProviderPort(@PathVariable("id") String id) {
        return restTemplate.getForObject(uri + "/provider/test/" + id, String.class);
    }
}
