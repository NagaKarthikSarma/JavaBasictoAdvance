package com.karthik.org.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Home {
	@Id
	private int hid;
	private String hname;
	private String htitle;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHtitle() {
		return htitle;
	}
	public void setHtitle(String htitle) {
		this.htitle = htitle;
	}
	public Home() {
		
	}
	@Override
	public String toString() {
		return "Home [hid=" + hid + ", hname=" + hname + ", htitle=" + htitle + "]";
	}
	public Home(int hid, String hname, String htitle) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.htitle = htitle;
	}
	
	
	
}
