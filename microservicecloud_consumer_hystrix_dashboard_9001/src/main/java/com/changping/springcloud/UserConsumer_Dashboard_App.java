package com.changping.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication
@EnableHystrixDashboard
public class UserConsumer_Dashboard_App {
	public static void main(String [] args) {
		SpringApplication.run(UserConsumer_Dashboard_App.class,args);
	}
}
