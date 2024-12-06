package com.org.quizapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


public class Response {
	private Integer id;
	private String response;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", response=" + response + "]";
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Integer id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
	
	
	
}
