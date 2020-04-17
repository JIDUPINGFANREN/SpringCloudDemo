package com.changping.springcloud.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changping.springcloud.dao.UserDao;
import com.changping.springcloud.entities.User;
@Service
public class UserServiceImpl implements UserServiceInf{
	@Autowired
	private UserDao userDao;
	@Override
	public boolean add(User user) {
		Boolean b = userDao.insert_User(user);	
		return b;
	}

	@Override
	public User get(String userid) {
		User user = userDao.findUser_by_UserId(userid);
		return user;
	}

	@Override
	public List<User> list() {
		List<User> user_list = userDao.queryUser();
		return user_list;
	}
}
