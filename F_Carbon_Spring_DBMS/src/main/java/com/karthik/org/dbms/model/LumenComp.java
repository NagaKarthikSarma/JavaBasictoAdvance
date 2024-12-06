package com.karthik.org.dbms.model;


public class LumenComp {
	
	
	private int eid;
	private String ename;
	private int exp;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public LumenComp(int eid, String ename, int exp) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "LumenComp [eid=" + eid + ", ename=" + ename + ", exp=" + exp + "]";
	}
	public LumenComp() {
		super();
		
	}
	
	

}
