package com.demo.bean;

public class Employee {

	private int id,contact;
	private String name,password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
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
	public Employee(int id, int contact, String name, String password) {
		super();
		this.id = id;
		this.contact = contact;
		this.name = name;
		this.password = password;
	}
	public Employee() {
		super();
	}
	
	


}
