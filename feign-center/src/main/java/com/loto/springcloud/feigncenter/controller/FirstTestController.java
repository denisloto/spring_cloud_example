package com.loto.springcloud.feigncenter.controller;

import com.loto.springcloud.feigncenter.client.FirstTestClient;
import com.loto.springcloud.feigncenter.client.SecondTestClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nina on 19/07/2017.
 */
@RestController
public class FirstTestController {
    @Autowired
    FirstTestClient firstTestClient;

    @Autowired
    SecondTestClient secondTestClient;

    @RequestMapping(value = "/tt/add" ,method = RequestMethod.GET)
    @ResponseBody
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return firstTestClient.add(a,b);
    }

    @RequestMapping(value = "/tt/substract" ,method = RequestMethod.GET)
    @ResponseBody
    @HystrixCommand(fallbackMethod = "substractErrProcess")
    public Integer substract(@RequestParam Integer a, @RequestParam Integer b) {
        return secondTestClient.substract(a,b);
    }

    private Integer substractErrProcess(@RequestParam Integer a, @RequestParam Integer b) {
        return -99;
    }
}
