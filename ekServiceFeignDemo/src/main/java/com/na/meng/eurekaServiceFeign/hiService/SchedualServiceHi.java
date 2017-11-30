package com.na.meng.eurekaServiceFeign.hiService;

import com.na.meng.eurekaServiceFeign.hiService.hiServiceImpl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: nameng
 * @Description:
 * @Date: 下午5:03 2017/10/31
 **/
@FeignClient(value = "eurekaClientDemo",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi")
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
