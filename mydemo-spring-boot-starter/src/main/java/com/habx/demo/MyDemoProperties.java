package com.habx.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = MyDemoProperties.MY_DEMO_PREFIX)
public class MyDemoProperties {
	public static final String MY_DEMO_PREFIX = "my.demo";
	
	private String name;
	
	private String password;

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
}
