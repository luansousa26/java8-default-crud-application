package com.luan.java8defaultcrudapplication.domain;

public class User {

	private String name;
	private String job;
	private int age;
	
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
