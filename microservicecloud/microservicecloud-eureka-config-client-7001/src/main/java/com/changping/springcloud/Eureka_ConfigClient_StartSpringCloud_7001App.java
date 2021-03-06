
package com.changping.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  //开启注册中心，允许其它的服务进行注册
public class Eureka_ConfigClient_StartSpringCloud_7001App
{
	public static void main(String[] args)
	{
		SpringApplication.run(Eureka_ConfigClient_StartSpringCloud_7001App.class, args);
	}
}
