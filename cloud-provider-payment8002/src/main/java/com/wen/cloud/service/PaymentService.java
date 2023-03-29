package com.wen.cloud.service;

import com.alibaba.druid.util.StringUtils;
import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.entity.Payment;
import com.wen.cloud.dao.PaymentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 7wen
 * @Date: 2023-03-01 16:40
 * @description:
 */
@Service
@Slf4j
@Transactional
public class PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Value("${server.port}")
    private String port;

    public CommonResult<Boolean> addPayment(Payment payment) {
        verifyParameters(payment);
        if (StringUtils.isEmpty(payment.getSerial())) {
            throw new RuntimeException("参数不能为空");
        }
        return new CommonResult(200,"success",paymentMapper.addPayment(payment)+port);
    }

    public CommonResult<Payment> getById(Payment payment) {
        verifyParameters(payment);
        if (payment.getId() == null) {
            throw new RuntimeException("参数有误,请联系管理员");
        }
        return new CommonResult(200,"success",paymentMapper.getById(payment));
    }

    private void verifyParameters(Payment payment) {
        if (payment == null) {
            throw new RuntimeException("参数有误,请联系管理员");
        }
    }
}
