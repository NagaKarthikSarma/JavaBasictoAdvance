package com.springsecurity.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.repository.UserRepo;

@Service
public class MyUserServiceDetails implements UserDetailsService {
	


	@Autowired
	UserRepo rep;
	

	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		UserCredentials usc = rep.findByUsername(username);
		return new UserPrincipal(usc) ;
	}

}
