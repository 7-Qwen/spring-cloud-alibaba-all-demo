package com.wen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 7wen
 * @Date: 2023-03-28 15:36
 * @description:
 */
@RestController
@RequestMapping(value = "/provider")
public class NacosController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/test/{id}")
    public String getPort(@PathVariable("id") String id) {
        return "hello nacos! The port is:" + port + ",id:" + id;
    }
}
