package com.springsecurity.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserCredentials {
	@Id
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public UserCredentials() {
		
	}
	@Override
	public String toString() {
		return "UserCredentials [username=" + username + ", password=" + password + "]";
	}
	

}