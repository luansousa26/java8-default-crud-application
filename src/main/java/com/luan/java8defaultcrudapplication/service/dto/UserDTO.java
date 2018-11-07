package com.luan.java8defaultcrudapplication.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Users")
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "User Identify.")
    private Long id;

	@ApiModelProperty(value = "User name.")
	private String name;
	
	@ApiModelProperty(value = "User job.")
	private String job;

	@ApiModelProperty(value= " User age.")
	private int age;

    @ApiModelProperty(value = "Alteration date")
    private LocalDate alterationDate;
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public LocalDate getAlterationDate() {
		return this.alterationDate;
	}
	public void setAlterationDate(LocalDate alterationDate) {
		this.alterationDate = alterationDate;
	}
}
