package com.huang.openplatformgateway;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.ReactiveValueOperations;
import reactor.core.publisher.Mono;


@SpringBootApplication
public class OpenPlatformGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenPlatformGatewayApplication.class, args);
    }

    @Value("${spring.data.redis.host}")
    private String redisHost;

    @Bean
    public CommandLineRunner init() {
        return args -> {
            System.out.println("Application started...");
            System.out.println("Redis Host: " + redisHost);
        };
    }

    @Bean
    public CommandLineRunner checkRedisConnection(ReactiveRedisTemplate<String, String> redisTemplate) {
        return args -> {
            ReactiveValueOperations<String, String> ops = redisTemplate.opsForValue();
            String value = ops.get("hello").block();
            System.out.println(value);
        };
    }

}
