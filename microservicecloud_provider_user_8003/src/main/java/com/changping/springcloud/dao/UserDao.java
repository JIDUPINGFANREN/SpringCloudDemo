package com.changping.springcloud.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.changping.springcloud.entities.User;
@Mapper
public interface UserDao {
	public  boolean insert_User(User user);
	public User findUser_by_UserId(String userid);
	public List<User> queryUser();
}
