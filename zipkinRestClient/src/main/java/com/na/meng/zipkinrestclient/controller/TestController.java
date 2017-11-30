package com.na.meng.zipkinrestclient.controller;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: nameng
 * @Description:
 * @Date: 下午3:12 2017/11/27
 **/
@RestController
public class TestController {

    private static final Logger LOG = Logger.getLogger(TestController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(String name){
        LOG.log(Level.INFO,"calling trace service-hi  ");

        return restTemplate.getForObject("http://localhost:8666/hi?name="+name,String.class);
    }

    @RequestMapping("/info")
    public String info(@RequestParam String name){
        LOG.log(Level.INFO, "calling trace service-hi ");
        return name+"i'm service-hi";
    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
