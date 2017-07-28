package com.loto.springcloud.feigncenter.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FirstTestClientHystrix implements FirstTestClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -1;
    }
}

