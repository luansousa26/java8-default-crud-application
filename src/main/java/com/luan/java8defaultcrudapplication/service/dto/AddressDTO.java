package com.luan.java8defaultcrudapplication.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AddressDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String street;
	
	private String district;

	private Long number;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String cep;
	
	private Long idClient;
	
	private LocalDate alterationDate;
	
	public Long geId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep  = cep;
	}
	
	public Long geIdClient() {
		return this.idClient;
	}
	
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	
	public LocalDate getAlterationDate() {
		return this.alterationDate;
	}
	
	public void setAlterationDate(LocalDate alterationDate) {
		this.alterationDate = alterationDate;
	}

}
