package com.na.meng.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: nameng
 * @Description:
 * @Date: 下午3:32 2017/11/2
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    //@Value("${spring.rabbitmq.host}")
    String host;

    @RequestMapping(value = "hi")
    public String hi(){
        return foo;
    }

    @RequestMapping(value = "mq")
    public String mq(){
        return host;
    }
}
