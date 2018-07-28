package com.luan.java8defaultcrudapplication.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.luan.java8defaultcrudapplication.domain.Address;
import com.luan.java8defaultcrudapplication.domain.Contact;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "clients")
public class ClientDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Client Identifier.")
	private Long id;
	
	@ApiModelProperty(value = "Client name.")
	private String name;
	
	@ApiModelProperty(value = "Client birth date.")
	private LocalDate birthDate;
	
	@ApiModelProperty(value = "Client CPF.")
	private String cpf;
	
	@ApiModelProperty(value = "Client CNPJ.")
	private String cnpj;
	
	@ApiModelProperty(value = "Client Salary.")
	private Long remuneration;
	
	@ApiModelProperty(value = "Client job.")
	private String job;
	
	@ApiModelProperty(value = "Client university formation.")
	private String formation;
	
	@ApiModelProperty(value = "Alteration Date.")
	private LocalDate alterationDate;
	
	@ApiModelProperty(value = "Client Contact.")
	private Contact contact;
	
	@ApiModelProperty(value = "Client Address.")
	private Address address;
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Long getRemuneration() {
		return this.remuneration;
	}
	
	public void setRemuneration(Long remuneration) {
		this.remuneration = remuneration;
	}
	
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public String getFormation() {
		return this.formation;
	}
	
	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	
	public LocalDate getAlterationDate() {
		return this.alterationDate;
	}
	
	public void setAlterationDate(LocalDate alterationDate) {
		this.alterationDate = alterationDate;
	}
	
	public Contact getContact() {
		return this.contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
}
