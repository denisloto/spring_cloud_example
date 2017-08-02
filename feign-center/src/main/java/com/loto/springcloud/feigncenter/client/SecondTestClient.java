package com.loto.springcloud.feigncenter.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "first-service")
public interface SecondTestClient {
    @RequestMapping(value = "/test/substract", method = RequestMethod.GET)
    Integer substract(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
