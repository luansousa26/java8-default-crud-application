package com.luan.java8defaultcrudapplication.service.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long id;
	
	private String name;
	
	private String job;

	private int age;
	
	public Long getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
