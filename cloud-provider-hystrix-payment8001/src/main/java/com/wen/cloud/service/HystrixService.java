package com.wen.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author: 7wen
 * @Date: 2023-03-21 20:49
 * @description:
 */
@Service
public class HystrixService {
    @Value("${server.port}")
    private String port;

    public String getOk(String msg) {
        return "get ok,thread:--->" + Thread.currentThread().getName() + ",port:---->" + port + ",msg--->" + msg;
    }

    public String getNo(String msg) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "get no,thread:--->" + Thread.currentThread().getName() + ",port:---->" + port + ",msg--->" + msg;
    }

    @HystrixCommand(fallbackMethod = "getSn_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),
    })
    public String getSn(String msg) {
        if (Integer.parseInt(msg) < 0) {
            throw new RuntimeException("不能为负数");
        }
        String sn = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "调用成功!!,sn号码:" + sn;
    }

    public String getSn_fallback(String msg) {
        return "不能调用负数!";
    }


}
