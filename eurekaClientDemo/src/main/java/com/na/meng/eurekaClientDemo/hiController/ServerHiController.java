package com.na.meng.eurekaClientDemo.hiController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: nameng
 * @Description:
 * @Date: 上午11:43 2017/10/31
 **/
@RestController
@RequestMapping("/")
public class ServerHiController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
