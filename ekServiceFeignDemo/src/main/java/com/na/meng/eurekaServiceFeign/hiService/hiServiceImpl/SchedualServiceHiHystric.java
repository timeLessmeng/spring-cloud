package com.na.meng.eurekaServiceFeign.hiService.hiServiceImpl;

import com.na.meng.eurekaServiceFeign.hiService.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author: nameng
 * @Description:
 * @Date: 下午6:16 2017/10/31
 **/

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
