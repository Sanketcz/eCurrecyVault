package com.demo.bean;

public class LoginBean {

	private String name,password;

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

	public LoginBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public LoginBean() {
		super();
	}
	
	
	
}
