package com.na.meng.serviceribbondemo.controller;

import com.na.meng.serviceribbondemo.service.SayHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: nameng
 * @Description:
 * @Date: 下午2:16 2017/10/31
 **/

@RestController
public class HelloController {

    @Autowired
    SayHelloService sayHelloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return sayHelloService.hiService(name);
    }

}
