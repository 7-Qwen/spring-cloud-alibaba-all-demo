package com.wen.cloud.controller;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.service.HystrixService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-21 20:52
 * @description:
 */
@RestController
@RequestMapping(value = "/provider")
public class ProviderHystrixController {
    @Resource
    private HystrixService hystrixService;

    @PostMapping(value = "/getOk")
    public String getOk(String msg) {
        return hystrixService.getOk(msg);
    }

    @PostMapping(value = "/getNo")
    public String getNo(String msg) {
        return hystrixService.getNo(msg);
    }

    @PostMapping(value = "/getSn")
    public String getSn(@RequestBody CommonResult commonResult) {
        String msg = commonResult.getMsg();
        return hystrixService.getSn(msg);
    }
}
