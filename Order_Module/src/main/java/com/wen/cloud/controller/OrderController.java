package com.wen.cloud.controller;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.entity.Order;
import com.wen.cloud.service.OrderService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-29 12:49
 * @description:
 */
@RefreshScope
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Resource
    private OrderService orderService;


    @PostMapping("/create")
    public CommonResult createOrder(@RequestBody Order order) {
        if (order.getProductId() == null || order.getUserId() == null) {
            return new CommonResult(444, "信息不完整,请检查后重试");
        }
        Boolean result = orderService.createOrder(order);
        return result ? new CommonResult(200, "更新成功",null) : new CommonResult(444, "更新失败",null);
    }


}
