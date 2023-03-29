package com.wen.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 7wen
 * @Date: 2023-03-06 22:42
 * @description:
 */
@RestController
@RequestMapping("/consul/provider")
@Slf4j
public class ProviderConsulController {
    @Value("${server.port}")
    private String port;

    @PostMapping("/getHello")
    public String getHello(@RequestBody String msg) {
        log.info("被调用");
        return port + "---->返回请求信息:" + msg;
    }
}
