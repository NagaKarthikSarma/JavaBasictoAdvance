package com.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.user.UserCredentials;



public interface UserRepo extends JpaRepository<UserCredentials, String>{

	public  UserCredentials findByUsername (String username);
	
	
	
}
