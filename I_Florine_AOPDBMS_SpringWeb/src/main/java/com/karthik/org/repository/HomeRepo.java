package com.karthik.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.org.Model.Home;

public interface HomeRepo extends JpaRepository<Home, Integer>{

	public Home findByhname(String name);
	
}
