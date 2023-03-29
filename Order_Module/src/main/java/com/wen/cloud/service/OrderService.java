package com.wen.cloud.service;

import com.wen.cloud.entity.Order;

/**
 * @author: 7wen
 * @Date: 2023-03-29 12:35
 * @description:
 */
public interface OrderService {

    /**
     * 创建订单
     */
    Boolean createOrder(Order order);


    /**
     * 更新订单状态
     */
    Boolean updateOrderStatus(Long userId,Integer status);
}
