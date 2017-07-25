package com.loto.springcloud.feigncenter.controller;

import com.loto.springcloud.feigncenter.client.FirstTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Nina on 19/07/2017.
 */
@Controller
public class FirstTestController {
    @Autowired
    FirstTestClient contractTestClient;

    @RequestMapping(value = "/test/add" ,method = RequestMethod.GET)
    @ResponseBody
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return contractTestClient.add(a,b);
    }
}
