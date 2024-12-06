package com.springsecurity.testCredentials;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class testPrincipal implements UserDetails{
	
	private static final long serialVersionUID = 1686361202783214127L;
	private testCred tc;
	

	public testPrincipal(testCred tcuser) {
	
		this.tc = tcuser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return tc.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return tc.getUsername();
	}

}
