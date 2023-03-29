package com.wen.cloud.controller;

import com.wen.cloud.entity.CommonResult;
import com.wen.cloud.service.AccountService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author: 7wen
 * @Date: 2023-03-29 13:18
 * @description:
 */
@RefreshScope
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Resource
    private AccountService accountService;
    @PostMapping(value = "/update")
    public CommonResult updateAccountMoney(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        Boolean result = accountService.updateAccountMoney(userId, money);
        return result ? new CommonResult(200, "更新成功") : new CommonResult(444, "更新失败");
    }

}
