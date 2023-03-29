package com.wen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 7wen
 * @Date: 2023-03-23 13:45
 * @description:
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {
    @Value("${config-update2.info}")
    private String info;

    @GetMapping(value = "getInfo")
    public String getInfo() {
        return info;
    }

    @PostMapping(value = "refush")
    public String refush() {
        return "success!";
    }
}
