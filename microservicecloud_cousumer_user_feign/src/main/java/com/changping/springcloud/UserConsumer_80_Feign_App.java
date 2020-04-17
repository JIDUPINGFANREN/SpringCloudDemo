package com.changping.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.changping.springcloud"})
@ComponentScan("com.changping.springcloud")
public class UserConsumer_80_Feign_App {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumer_80_Feign_App.class, args);
	}
}
