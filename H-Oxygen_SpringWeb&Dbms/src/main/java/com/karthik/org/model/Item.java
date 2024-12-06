package com.karthik.org.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
	@Id
	private int id;
	private int itemname;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getItemname() {
		return itemname;
	}
	public void setItemname(int itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Item() {
		super();
	
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemname=" + itemname + ", price=" + price + "]";
	}
	
	

}
