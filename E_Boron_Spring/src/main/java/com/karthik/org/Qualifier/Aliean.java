package com.karthik.org.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



public class Aliean {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		CarEngine  ce = context.getBean(CarEngine.class);
		ce.carModel();
		
		
		
		((ConfigurableApplicationContext) context).close();

	}

}
