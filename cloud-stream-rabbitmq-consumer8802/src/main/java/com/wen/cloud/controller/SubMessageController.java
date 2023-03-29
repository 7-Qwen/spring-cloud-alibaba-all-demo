package com.wen.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author: 7wen
 * @Date: 2023-03-23 23:12
 * @description:
 */
@EnableBinding(Sink.class)
@Slf4j
public class SubMessageController {
    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void subMessage(Message<String> message) {
        log.info("接收到的消息为:" + message.getPayload() + "..端口号为:" + port);
    }
}
