package com.wen.cloud.service.fallback;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.service.AccountService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:01
 * @description:
 */
@Component
public class AccountServiceImpl implements AccountService {
    @Override
    public CommonResult updateAccountMoney(Long userId, BigDecimal money) {
        return new CommonResult(444, "用户中心微服务出现错误 ,请查看相关日志");
    }
}
