//package com.huang.openplatformgateway;
//
//import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.core.publisher.Mono;
//
//@Configuration
//public class ApiKeyResolverConfiguration {
//
////    @Bean
////    public KeyResolver apiKeyResolver() {
////        return exchange -> {
////            String path = exchange.getRequest().getPath().value();
////            System.out.println("Key Resolver Path: " + path);
////            return Mono.just(path);
////        };
////    }
//
//    @Bean
//    public KeyResolver userKeyResolver() {
//        return exchange -> {
//            String user = exchange.getRequest().getQueryParams().getFirst("user");
//            System.out.println("Key Resolver User: " + user);
//            return Mono.justOrEmpty(user);
//        };
//    }
//}
