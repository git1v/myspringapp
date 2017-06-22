package com.tuyano.sample;

public class ExternalBean {
	private HelloBean bean;

	public HelloBean getBean() {
		return bean;
	}

	public void setBean(HelloBean bean) {
		this.bean = bean;
	}
	public void sayHello(){
		System.out.println("===================");
		System.out.println("Bean Data: "+bean.getTitle()+" : Bean Message "+bean.getMessage());
		System.out.println("===================");
	}
}
