package com.karthi.org.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurent {

	@Id
	private int table;
	private String customer;
	public int getTable() {
		return table;
	}
	public void setTable(int table) {
		this.table = table;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Restaurent(int table, String customer) {
		super();
		this.table = table;
		this.customer = customer;
	}
	
	
}
