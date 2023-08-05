package com.js.dto;

public class Customer {
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone="
				+ phone + "]";
	}
	private int id;
	private String name;
	private String email;
	private int password;	
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email =email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password2) {
		this.password =password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
}
