package com.karthi.org.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", customer=" + customer + "]";
	}
	public Hotel() {
	
	}
	@Id
	private int id;
	private String customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Hotel(int id, String customer) {
		super();
		this.id = id;
		this.customer = customer;
	}
	

}
