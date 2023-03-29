package com.wen.cloud.controller;

import com.wen.cloud.service.StreamSendMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-23 23:07
 * @description:
 */
@RestController
public class MessageController {
    @Resource
    private StreamSendMessageSource streamSendMessageSource;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return streamSendMessageSource.send();
    }
}
