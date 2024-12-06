package com.springsecurity.testCredentials;

import org.springframework.data.jpa.repository.JpaRepository;

public interface testRepo extends JpaRepository<testCred, String> {

	public testCred getByUsername(String username);
	
	
	
	
}
