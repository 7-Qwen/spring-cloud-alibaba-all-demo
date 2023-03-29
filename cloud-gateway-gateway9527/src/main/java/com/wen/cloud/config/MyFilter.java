package com.wen.cloud.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: 7wen
 * @Date: 2023-03-22 22:42
 * @description:
 */
@Component
@Slf4j
public class MyFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String userName = exchange.getRequest().getQueryParams().getFirst("userName");
        if ("".equals(userName) || userName == null) {
            log.error("用户名为空,不能访问!");
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.NOT_EXTENDED);
            return response.setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
