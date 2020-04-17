package com.changping.springcloud.service;
import java.util.List;
import com.changping.springcloud.entities.User;
public interface UserServiceInf {
	public  boolean add(User user);
	public User get(String userid);
	public List<User> list();
}
