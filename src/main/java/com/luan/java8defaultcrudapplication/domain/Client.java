package com.luan.java8defaultcrudapplication.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.luan.java8defaultcrudapplication.utils.Address;
import com.luan.java8defaultcrudapplication.utils.Contact;

@Entity
@Table(name = "TB_CLIENT")
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private LocalDate birthDate;
	private String cpf;
	private String cnpj;
	private Long remuneration;
	private String job;
	private String formation;
	private Address adress;
	private Contact contact;
	
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
    
	public Address getAdress() {
		return this.adress;
	}
	
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	
	public Contact getContact() {
		return this.contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
