package com.changping.springcloud.service;
import java.util.List;
import org.springframework.stereotype.Component;
import com.changping.springcloud.entities.User;
import feign.hystrix.FallbackFactory;
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService> {
	@Override
	public UserClientService create(Throwable arg0) {
		return new UserClientService() {

			@Override
			public boolean add(User user) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public User get(String userId) {
				return new User().setUserid(userId).setUsername("粗问题了，来自consumer提供的服务降级信息，此刻服务提供者已经关闭，正在维护中，请联系管理员...").setDb_source("without info in the database");
			}

			@Override
			public List<User> list() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
