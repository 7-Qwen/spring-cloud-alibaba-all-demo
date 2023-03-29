package com.wen.cloud.service.impl;

import com.wen.cloud.service.StreamSendMessageSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author: 7wen
 * @Date: 2023-03-23 23:00
 * @description:
 */
@EnableBinding(Source.class)
@Slf4j
public class StreamSendMessageSourceImpl implements StreamSendMessageSource {
    @Autowired
    @Qualifier(Source.OUTPUT)
    private MessageChannel messageChannel;

    @Override
    public String send() {
        String uuid = UUID.randomUUID().toString();
        messageChannel.send(MessageBuilder.withPayload(uuid).build());
        log.info("已发送消息:" + uuid);
        return uuid;
    }
}
