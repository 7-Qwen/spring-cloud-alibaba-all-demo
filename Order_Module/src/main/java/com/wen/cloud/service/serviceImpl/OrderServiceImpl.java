package com.wen.cloud.service.serviceImpl;

import com.wen.cloud.dao.OrderMapper;
import com.wen.cloud.entity.Order;
import com.wen.cloud.service.AccountService;
import com.wen.cloud.service.OrderService;
import com.wen.cloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 7wen
 * @Date: 2023-03-29 12:38
 * @description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * 创建订单
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public Boolean createOrder(Order order) {
        //创建订单
        log.info("------>创建订单开始");
        orderMapper.createOrder(order);
        log.info("------>创建订单结束");
        //扣除库存
        log.info("------>更新库存开始");
        storageService.updateStorage(order.getProductId(), order.getCount());
        log.info("------>更新库存结束");
        //扣除余额
        log.info("------>更新余额开始");
        accountService.updateAccountMoney(order.getUserId(), order.getMoney());
        log.info("------>更新余额结束");
        //更新订单状态
        log.info("------>更新订单状态开始");
        orderMapper.updateOrderStatus(order.getUserId(), 0);
        log.info("------>更新订单状态结束");
        return true;
    }

    /**
     * 更新订单状态
     */
    @Override
    public Boolean updateOrderStatus(Long userId, Integer statusCode) {
        return orderMapper.updateOrderStatus(userId, statusCode);
    }
}
