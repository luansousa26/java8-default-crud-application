package com.luan.java8defaultcrudapplication.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USER")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Column(name="USER_NAME", nullable = false )
	private String name;
	
	@Column(name="USER_JOB", nullable = false)
	private String job;
	
	@Column(name="USER_AGE", nullable = false)
	private int age;
	
	public void setId(Long id) {
		this.id = id;
		
	}
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