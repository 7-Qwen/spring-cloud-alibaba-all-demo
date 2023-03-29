package com.wen.cloud.service;

import com.wen.cloud.fallback.ConsumerFeignHystrixServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author: 7wen
 * @Date: 2023-03-21 21:02
 * @description:
 */
@Service
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = ConsumerFeignHystrixServiceFallbackImpl.class)
public interface ConsumerFeignHystrixService {
    @PostMapping(value = "/provider/getOk")
    public String getOk(String msg);

    @PostMapping(value = "/provider/getNo")
    public String getNo(String msg);

    @PostMapping(value = "/provider/getSn")
    public String getSn(String msg);
}
