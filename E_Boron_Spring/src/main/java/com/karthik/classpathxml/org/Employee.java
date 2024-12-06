package com.karthik.classpathxml.org;

import javax.management.ConstructorParameters;

public class Employee {
int age;

Manager manage;

	public int getAge() {
	return age;
}
	
	//@ConstructorParameters({"age","manage"})  // what name you specify in <constructor-args> need to mention heres
	//it will help you to assign based on the values when you take name otherwise it will throw mismatch exception
	//when you use index then when the parameters are interchanged in the constructor it might cause error
	@ConstructorParameters({"age","manage"})  
public Employee(int age, Manager manage) {
	super();
	this.age = age;
	this.manage = manage;
}

public void setAge(int age) {
	this.age = age;
}

	public void employee() {
		System.out.println("I am employee. I will do what they teach");
		System.out.println("my age is: "+age);
	}
	
}
