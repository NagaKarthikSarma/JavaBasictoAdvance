package com.karthik.org.javabasedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.karthik.org.autowireBean.Ferrari;
import com.karthik.org.autowireBean.Ford;

@Configuration
@ComponentScan("com.karthik.org")
public class ApplicationConfig {
	
//	@Autowired          // in the same package you don't need to the object   // when you declare the class with component in different package
//	public Student student;                                                   // you can use @Autowired
	@Bean 
	public Student std() {
		
		return new Student();
	}
	
	@Bean
	public Teacher td() {
		return new Teacher();
	}
	
	
	@Bean
	public Ford fd() {
		
		return new Ford();
	}
	
	@Bean
	public Ferrari fr() {
		return new Ferrari();
	}
	
}
