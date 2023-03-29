package com.wen.cloud.service;

import java.math.BigDecimal;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:20
 * @description:
 */
public interface AccountService {

    /**
     * 修改账号余额
     */
    Boolean updateAccountMoney(Long userId, BigDecimal money);
}
