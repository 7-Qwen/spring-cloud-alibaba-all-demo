package com.wen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 7wen
 * @Date: 2023-03-28 16:40
 * @description:
 */
@RestController
@RequestMapping(value = "/nacos")
@RefreshScope
public class NacosConfigController {
    @Value("${config.info}")
    private String info;

    @GetMapping("/getInfo")
    public String getInfo() {
        return info;
    }
}
