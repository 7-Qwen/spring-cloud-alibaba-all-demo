package com.wen.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 7wen
 * @Date: 2023-03-06 10:22
 * @description:
 */
@RestController
@RequestMapping(value = "/zookeeper/provider")
@Slf4j
public class ZookeeperController {
    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/hello")
    public String helloZookeeper(@RequestBody String msg) {
        log.info("接口被调用");
        return port + "--====----->get:" + "hello!!!" + msg;
    }
}
