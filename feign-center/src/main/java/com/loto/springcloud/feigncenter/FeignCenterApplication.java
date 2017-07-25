package com.loto.springcloud.feigncenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignCenterApplication.class, args);
    }
}
