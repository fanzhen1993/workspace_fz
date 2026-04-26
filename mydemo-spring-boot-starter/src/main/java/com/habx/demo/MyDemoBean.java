package com.habx.demo;

public class MyDemoBean {
	private String name;
	private String password;
	
	public MyDemoBean() {
		super();
	}

	public MyDemoBean(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyDemoBean [name=" + name + ", password=" + password + "]";
	}	
}
