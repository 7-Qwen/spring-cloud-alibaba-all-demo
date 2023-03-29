package com.wen.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.entity.Payment;
import com.wen.cloud.service.ConsumerFeignHystrixService;
import com.wen.cloud.service.ConsumerFeignService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-20 21:42
 * @description:
 */
@RestController
@RequestMapping(value = "/order")
public class ConsumerFeignController {
    @Resource
    private ConsumerFeignService consumerFeignService;
    @Resource
    private ConsumerFeignHystrixService consumerFeignHystrixService;

    @GetMapping(value = "/testLb")
    public String getPort() {
        return consumerFeignService.getTestLb();
    }

    @PostMapping(value = "getPaymentById")
    public CommonResult getPaymentById(@RequestBody Payment payment) {
        return consumerFeignService.getPaymentById(payment);
    }

    @GetMapping(value = "/getOk")
    public String getOk(@RequestParam String msg) {
        return consumerFeignHystrixService.getOk(msg);
    }


    @GetMapping(value = "/getNo")
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })
    public String getNo(@RequestParam String msg) {
        return consumerFeignHystrixService.getNo(msg);
    }

    public String paymentInfo_TimeOutHandler(String msg) {
        return " = = = =";
    }

    @GetMapping(value = "/getSn")
    public String getSn(String msg) {
        return consumerFeignHystrixService.getSn(msg);
    }

}
