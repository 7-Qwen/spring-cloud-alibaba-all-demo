package com.wen.cloud.service;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.service.fallback.AccountServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author: 7wen
 * @Date: 2023-03-29 12:59
 * @description:
 */
@FeignClient(value = "seata-account-service",fallback = AccountServiceImpl.class)
public interface AccountService {
    @PostMapping(value = "/account/update")
    CommonResult updateAccountMoney(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
