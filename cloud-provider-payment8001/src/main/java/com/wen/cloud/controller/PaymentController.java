package com.wen.cloud.controller;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.entity.Payment;
import com.wen.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 7wen
 * @Date: 2023-03-01 16:52
 * @description:
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String serviceId;
    @Resource
    private PaymentService paymentService;
    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/addPayment")
    public CommonResult<Boolean> addPayment(@RequestBody Payment payment) {
        List<String> services = discoveryClient.getServices();
        log.info(services.toString());
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        for (ServiceInstance instance : instances) {
            log.info(instance.getHost() + "--" + instance.getPort() + "--" + instance.getUri());
        }
        log.info("进入了添加...端口号:" + port);
        return paymentService.addPayment(payment);
    }

    @PostMapping("/getPaymentById")
    public CommonResult<Payment> getPaymentById(@RequestBody Payment payment) {
        log.info("进入了查询...端口号:" + port);
        return paymentService.getById(payment);
    }

    @GetMapping("/testLb")
    public String getTestLb() {
        return port;
    }
}
