package com.springsecurity.testCredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class testUserServicedet implements UserDetailsService{

	@Autowired
	testRepo reps;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		testCred tcuser= reps.getByUsername(username);
		
		return new testPrincipal(tcuser);
	}

}
