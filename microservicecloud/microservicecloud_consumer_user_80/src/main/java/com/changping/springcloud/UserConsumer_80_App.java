package com.changping.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.changping.springcloud.myrule.MyselfRule;
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-USER",configuration=MyselfRule.class)
public class UserConsumer_80_App {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumer_80_App.class, args);
	}
}
