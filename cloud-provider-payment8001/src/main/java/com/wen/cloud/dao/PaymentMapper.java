package com.wen.cloud.dao;

import com.wen.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: 7wen
 * @Date: 2023-03-01 16:36
 * @description:
 */
@Mapper
public interface PaymentMapper {
    Boolean addPayment(Payment payment);

    Payment getById(Payment payment);
}
