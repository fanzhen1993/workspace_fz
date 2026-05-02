package com.example.springboot.model;

import java.util.Date;

public class User {

	private Long id;

	private String username;

	private String email;

	private String phone;

	private Date createDate;

	private Date updateDate;

	public User() {
	}

	public User(Long id, String username, String email, String phone, Date createDate, Date updateDate) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", phone=" + phone
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

}
