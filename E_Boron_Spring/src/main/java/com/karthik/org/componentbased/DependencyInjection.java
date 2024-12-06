package com.karthik.org.componentbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DependencyInjection {

	public static void main(String[] args) {
		
		ApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Student std = context.getBean(Student.class);
		
		
		std.student();
		Teacher tr= context.getBean(Teacher.class);
		
		tr.teacher();
		
		//I can use the parent interface to create the object of classes 
		
		CarModel  in = context.getBean(Innova.class);
		System.out.println(in.carName());
		
		CarModel hn = context.getBean(Honda.class);
		System.out.println(hn.carName());
		
	//((AbstractApplicationContext) context).close();  
		
((ConfigurableApplicationContext) context).close();		    /* This method is the recommended approach for closing an application context.
It extends AbstractApplicationContext.close() and provides additional customization options*/

	}

}
