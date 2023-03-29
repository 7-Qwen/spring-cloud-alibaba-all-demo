package com.wen.cloud.service;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author: 7wen
 * @Date: 2023-03-20 21:40
 * @description:
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface ConsumerFeignService {
    @GetMapping("/payment/testLb")
    String getTestLb();

    @PostMapping("/payment/getPaymentById")
    CommonResult<Payment> getPaymentById(@RequestBody Payment payment);
}
