package com.loto.springcloud.feigncenter.controller;

import com.loto.springcloud.feigncenter.client.FirstTestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Nina on 19/07/2017.
 */
@RestController
public class FirstTestController {
    @Autowired
    FirstTestClient firstTestClient;

    @RequestMapping(value = "/tt/add" ,method = RequestMethod.GET)
    @ResponseBody
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return firstTestClient.add(a,b);
    }
}
