package com.karthik.org.javabasedBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karthik.org.autowireBean.Ferrari;
import com.karthik.org.autowireBean.Ford;

public class BeanClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Student str = context.getBean(Student.class);
		str.student();
		
Teacher td = context.getBean(Teacher.class);

td.teacher();

Ford fd = context.getBean(Ford.class);
fd.speed(450);
Ferrari  fr = context.getBean(Ferrari.class);

fr.speed(560);
fr.carModel();

	}

}
