package com.example.learning.rest.webservices.restfulwebservices.bean;

public class DummyBean {
	
	private String message;

	public DummyBean(String message){
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
