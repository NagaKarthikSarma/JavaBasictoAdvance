package com.karthik.classpathxml.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AvatarClassPath {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml"); 
	
	Manager mn = context.getBean(Manager.class);
	
	mn.manager();
	
	Employee emp = context.getBean(Employee.class);
	emp.employee();
	
	

	((ConfigurableApplicationContext) context).close();
	

	}

}
