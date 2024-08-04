package com.huang.openplatformgateway;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class UriKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        final String path = exchange.getRequest().getURI().getPath();
        System.out.println("111111 Key Resolver Path: " + path); // 日志输出以确认调用
        return Mono.just(path);
    }
}
