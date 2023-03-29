package com.wen.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 7wen
 * @Date: 2023-03-22 21:22
 * @description:
 */
@Configuration
public class MyRoutes {
    @Bean
    public RouteLocator guoNeiRouth(RouteLocatorBuilder rb) {
        RouteLocatorBuilder.Builder routes = rb.routes();
        return routes.route("baidu-guonei-routh", r ->
                r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
    }

    @Bean
    public RouteLocator guoJiRouth(RouteLocatorBuilder rb) {
        RouteLocatorBuilder.Builder routes = rb.routes();
        return routes.route("baidu-guoji-routh", r ->
                r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
    }
}
