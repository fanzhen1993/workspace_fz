package com.fz.habx.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {
	
	@Value("${loginId}")
	private String loginId;
	
	@Value("${loginName}")
	private String loginName;

	public Properties() {
		super();
	}

	public Properties(String loginId, String loginName) {
		super();
		this.loginId = loginId;
		this.loginName = loginName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Override
	public String toString() {
		return "Properties [loginId=" + loginId + ", loginName=" + loginName + "]";
	}
	
}
