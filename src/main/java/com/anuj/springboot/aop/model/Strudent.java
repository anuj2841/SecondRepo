package com.anuj.springboot.aop.model;

import org.springframework.stereotype.Service;

@Service
public class Strudent {
	
	private String name;
	private String email;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter called");
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(String age) {
		this.age=age;
	}
}
