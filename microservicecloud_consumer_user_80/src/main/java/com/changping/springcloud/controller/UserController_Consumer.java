package com.changping.springcloud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.changping.springcloud.entities.User;
/**
 * REST_URL_PREFIX+"/user/add",user,Boolean.class
 * 请求的url....................,参数.,返回类型........
 * */
@RestController
public class UserController_Consumer {
	//private static final String REST_URL_PREFIX="http://localhost:8001";	
	private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-USER";//使之成为前缀，通过微服务来进行访问
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/user/add")
	public boolean add(User user)
	{	//postForObject意思是以post请求方式来进行请求，请求服务的地址
		return restTemplate.postForObject(REST_URL_PREFIX+"/user/add",user,Boolean.class);
	}
	
	@RequestMapping(value="/consumer/user/get/{id}")
	public User get(@PathVariable("id") String userId)
	{
		return restTemplate.getForObject(REST_URL_PREFIX+"/user/get/"+userId,User.class);
	}
	
	@SuppressWarnings("unchecked")//对异常的处理可有可无。
	@RequestMapping(value="/consumer/user/list")
	public List<User> list()
	{
		return restTemplate.getForObject(REST_URL_PREFIX+"/user/list",List.class);
	}
	
	@RequestMapping(value="/consumer/user/discovery")//提供一个路径,访问这个路径相当于访问8001服务提供者。
	public Object discovery()
	{
		return restTemplate.getForObject(REST_URL_PREFIX+"/user/discovery",Object.class);
	}
}
