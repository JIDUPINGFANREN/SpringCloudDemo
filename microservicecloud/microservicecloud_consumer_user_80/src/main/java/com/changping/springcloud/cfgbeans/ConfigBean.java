package com.changping.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



/**
 * SpringBoot里定义了一个注解，Configuration
 * 它的作用代替了原本Spring里的ApplicationContext.xml
 * 凡是在开头配有这个注解的类都可以看成是一个Spring的配置文件。
 * （注解如果没有被加载，说明需要force update）
 * 之前Spring中的ApplicationContext.xml里是这样写的,比如：
 * <bean id="userService" class="com.changping.mall.UerService"></bean>
 * */
@Configuration
public class ConfigBean {
	@Bean//这个注解等同于xml文件中的<bean>，用于spring容器初始化后的加载。
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{	
		RestTemplate rt = new RestTemplate();
		return rt;
	}
	/**随机策略，随机访问服务8001、8002、8003服务提供者，
	 * 默认策略是轮询，重新声明访问规则，将会覆盖默认轮询规则。
	 * */
	/*@Bean
	public IRule myRule()
	{
		RetryRule rtRule = new RetryRule();
		return rtRule;
	}*/
}
