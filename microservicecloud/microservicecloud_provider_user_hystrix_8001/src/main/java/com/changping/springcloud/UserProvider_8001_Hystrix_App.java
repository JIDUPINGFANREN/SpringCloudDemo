package com.changping.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient 
@EnableCircuitBreaker //开启hystrix功能
public class UserProvider_8001_Hystrix_App {
	public static void main(String[] args) {
		SpringApplication.run(UserProvider_8001_Hystrix_App.class, args);
	}
}
