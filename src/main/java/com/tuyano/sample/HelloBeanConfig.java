package com.tuyano.sample;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
public class HelloBeanConfig {
	private String title="Hello Bean Impl";
	private String message="the bean from config class!!";
	private HelloBean helloBean=new HelloBeanImpl(title, message);
	private SampleMethodAdvice sampleMethodAdvice=new SampleMethodAdvice();
	
	@Bean
	HelloBean helloBeanImpl(){
		return helloBean;
	}
	
	@Bean
	SampleMethodAdvice sampleMethodAdvice(){
		return sampleMethodAdvice;
	}
	
	@Bean
	ProxyFactoryBean proxyFactoryBean(){
		System.out.println("this is hellobeanconfig");
		ProxyFactoryBean bean=new ProxyFactoryBean();
		bean.setTarget(helloBean);
		String names[]={"sampleMethodAdvice"};
		bean.setInterceptorNames(new String[]{"sampleMethodAdvice"});
		return bean;
	}
}
