package com.org.oauthsec.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private String Username;
	private String password;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", password=" + password + "]";
	}
	public User(String username, String password) {
		super();
		Username = username;
		this.password = password;
	}
	
	

}
