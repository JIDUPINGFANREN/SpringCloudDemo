package com.changping.springcloud.service;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.changping.springcloud.entities.User;
//@FeignClient(value="MICROSERVICECLOUD-USER")//应用名，加上服务提供者的方法。
//只要是哪个方法出现类异常的状态，就会去找fallbackFactory，然后fallbackFacotry会去找它自己的实现类。
@FeignClient(value="MICROSERVICECLOUD-USER",fallbackFactory=UserClientServiceFallbackFactory.class)
public interface UserClientService {
	@RequestMapping(value="/user/add",method=RequestMethod.POST)
	public boolean add(@RequestBody User user);

	@RequestMapping(value="/user/get/{id}",method=RequestMethod.GET)
	public User get(@PathVariable("id")String userId);
	
	@RequestMapping(value="/user/list",method=RequestMethod.GET)
	public List<User> list();
}
