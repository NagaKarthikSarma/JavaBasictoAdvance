package com.springsecurity.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


public class UserPrincipal  implements UserDetails{
    

	private static final long serialVersionUID = 1L;
	
private	UserCredentials user;
	
	public UserPrincipal(UserCredentials user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	@Override
	public String getPassword() {
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
	
		return user.getUsername();
	}

	
}
