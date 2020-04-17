package com.changping.springcloud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.changping.springcloud.entities.User;
import com.changping.springcloud.service.UserServiceInf;

@RestController  //自带Responsbody注解功能
public class UserController {
	@Autowired
	private UserServiceInf userServiceInf;
	@RequestMapping(value="/user/add",method=RequestMethod.POST)
	public boolean add(@RequestBody User user) 
	{
		boolean b = userServiceInf.add(user);
		return b;
	}
	
	@RequestMapping(value="/user/get/{id}",method=RequestMethod.GET)
	public User get(@PathVariable("id")String userId)
	{
		User user = userServiceInf.get(userId);
		return user;
	}
	
	@RequestMapping(value="/user/list",method=RequestMethod.GET)
	public List<User> list()
	{
		List<User> list_user = userServiceInf.list();
		return list_user;
	}
	
	@Autowired
	private DiscoveryClient client;
	@RequestMapping(value = "/user/discovery", method = RequestMethod.GET)
	public Object discovery()
	{
		List<String> list = client.getServices();//获得全部的服务名即启动类上带有@EnableDiscoveryClient的服务都会被发现
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD_USER");//注册中心上的application
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}
}
