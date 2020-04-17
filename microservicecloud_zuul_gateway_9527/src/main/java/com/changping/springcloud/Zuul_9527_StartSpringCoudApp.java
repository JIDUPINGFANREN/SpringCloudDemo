package com.changping.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCoudApp {
	public static void main(String [] args)
	{
		SpringApplication.run(Zuul_9527_StartSpringCoudApp.class, args);
	}
}
