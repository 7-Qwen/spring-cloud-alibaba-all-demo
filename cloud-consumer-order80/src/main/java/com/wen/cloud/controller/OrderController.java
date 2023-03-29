package com.wen.cloud.controller;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.entity.Payment;
import com.wen.cloud.lb.LoadBalancerImpl;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-01 19:02
 * @description:
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {
    private final String REMOTE_ADDR = "http://CLOUD-PAYMENT-SERVICE";
    private final String SERVICE_ID = "CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private LoadBalancerImpl loadBalancer;

    @PostMapping(value = "/addPayment")
    public CommonResult addPaymentRemoteCall(@RequestBody Payment payment) {
        return restTemplate.postForObject(REMOTE_ADDR + "/payment/addPayment", payment, CommonResult.class);
    }

    @PostMapping(value = "/getPaymentById")
    public CommonResult getPaymentById(@RequestBody Payment payment) {
        return restTemplate.postForObject(REMOTE_ADDR + "/payment/getPaymentById", payment, CommonResult.class);
    }

    @GetMapping(value = "/testLb")
    public CommonResult getTestLbResult() {
        ServiceInstance serviceInstance = loadBalancer.getServiceInstance(discoveryClient.getInstances(SERVICE_ID));
        return new CommonResult(200,"success",restTemplate.getForObject(serviceInstance.getUri() + "/payment/testLb",String.class));
    }
}
