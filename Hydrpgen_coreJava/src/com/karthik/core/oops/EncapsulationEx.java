package com.karthik.core.oops;

public class EncapsulationEx {
	
	
	private int id;
	private String name;
	private int age;
	

	public EncapsulationEx(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public EncapsulationEx() {
		super();
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EncapsulationEx [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		
//		 Encapslation: binding data and method in single capsule
	   
		EncapsulationEx  encap = new EncapsulationEx(1,"karthik",22);
		
		System.out.println(encap.toString());
		
		EncapsulationEx  encap1= new EncapsulationEx();
		encap1.setId(2);
		encap1.setName("sarma");
		encap1.setAge(22);
		
		System.out.println(encap1.toString());

	}





}
