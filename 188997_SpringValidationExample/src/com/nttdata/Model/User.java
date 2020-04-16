package com.nttdata.Model;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty(message="User name should not be Empty")
	private String username;
	@NotEmpty(message="Address should not be Empty")
	private String address;
	@NotEmpty(message="Email should not be Empty")
	private String email;
	@NotEmpty(message="mobile should not be Empty")
	private long mobile;
	@NotEmpty(message="Password should not be Empty")
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
