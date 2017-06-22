package com.tuyano.sample;

public class HelloBeanImpl implements HelloBean{
	private String title;
	private String message;
	public HelloBeanImpl(){}

	public HelloBeanImpl(String title, String message) {
		super();
		this.title = title;
		this.message = message;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public void hello(){
		System.out.println("===================");
		System.out.println("<< "+this.getTitle()+" >>");
		
		System.out.println("-------------------");
		System.out.println(this.getMessage());
		System.out.println("===================");
	}
}
