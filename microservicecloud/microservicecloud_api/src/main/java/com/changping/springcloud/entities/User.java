package com.changping.springcloud.entities;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**@Accessors作用：
 * 存取器，用于配置getter和setter方法的生成结果
 * 三个属性：fluent、chain、prefix
 * 1、fluent：流畅的，设置为true，getter和setter方法的方法名都是基础属性名，且setter方法返回当前对象
 * 2、chain：链式的，设置为true，则setter方法返回当前对象
 * 3、prefix：前缀，用于生成getter和setter方法的字段名会忽视指定前缀（遵守驼峰命名）*/

@SuppressWarnings("serial")
@AllArgsConstructor//全参构造
@NoArgsConstructor//无参构造
@Data//由于导入lombok，所以自动生成get、set方法
@Accessors(chain=true)
public class User implements Serializable{
	private String userid;
	private String userpass;
	private String username;
	private String db_source;//微服务服务架构下每个被发布的服务可以有不同的数据库
	public User(String username) {
		super();
		this.username = username;
	}
//主方法，给参数赋值//用于测试get、set方法是否能用
	public static void main(String [] args)
	{
		User user = new User();
		user.setUserid("001").setUserpass("123").setUsername("tom").setDb_source("db0325");
		String str ="EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.";
				
		System.out.println(str.toLowerCase());
		
	}
}
