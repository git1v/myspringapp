package com.tuyano.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("start-----------------------");
		ApplicationContext app=new AnnotationConfigApplicationContext(HelloBeanConfig.class);
		HelloBean bean1=(HelloBean)app.getBean("helloBean");
		bean1.hello();
		
		HelloBean bean2=(HelloBean)app.getBean("proxyFactoryBean");
		bean2.hello();
	}

}
