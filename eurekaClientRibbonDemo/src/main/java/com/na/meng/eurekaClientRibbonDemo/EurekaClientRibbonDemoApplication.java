package com.na.meng.eurekaClientRibbonDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientRibbonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRibbonDemoApplication.class, args);
	}
}
