package com.luan.java8defaultcrudapplication.utils;

public class Address {
     
	private String street;
	private String district;
	private Long number;
	private String city;
	private String state;
	private String cep;
	
	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getDistrict() {
		return this.district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public Long getNumber() {
		return this.number;
	}
	
	public void setNumber(Long number) {
		this.number = number;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep  = cep;
	}
}
