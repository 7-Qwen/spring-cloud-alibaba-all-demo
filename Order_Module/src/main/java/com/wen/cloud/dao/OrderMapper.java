package com.wen.cloud.dao;

import com.wen.cloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 7wen
 * @Date: 2023-03-29 10:20
 * @description:
 */
@Mapper
public interface OrderMapper {

    /**
     * 创建订单
     */
    Boolean createOrder(Order order);


    /**
     * 确认订单状态
     */
    Boolean updateOrderStatus(@Param("userId")Long userId,@Param("statusCode") Integer statusCode);
}
