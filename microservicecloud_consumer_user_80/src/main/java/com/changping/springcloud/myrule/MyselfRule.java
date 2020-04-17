package com.changping.springcloud.myrule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.netflix.loadbalancer.IRule;
@Configuration
public class MyselfRule {
	@Bean
	public IRule myRule()
	{
		return new MyselfRule2();//调用自定义规则
	}
}
