package com.luan.java8defaultcrudapplication.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ADDRESS")
@SequenceGenerator(name="sequency", initialValue=1, allocationSize=100)
public class Address {
     
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequency")
	@Id
	private Long id;
	private String street;
	private String district;
	private Long number;
	private String city;
	private String state;
	private String cep;
	private Long idClient;
	
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
}
