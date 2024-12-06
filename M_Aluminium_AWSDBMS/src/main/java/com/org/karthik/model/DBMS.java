package com.org.karthik.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DBMS {
	
	@Id
	public int jobId;
	public String jobName;
	public int experience;
	public String description;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DBMS(int jobId, String jobName, int experience, String description) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.experience = experience;
		this.description = description;
	}
	public DBMS() {
		
		
	}
	
	

}
