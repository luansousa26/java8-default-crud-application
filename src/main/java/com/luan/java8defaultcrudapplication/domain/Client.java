package com.luan.java8defaultcrudapplication.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CLIENT")
@SequenceGenerator(name = "sequency", initialValue = 1, allocationSize = 100)
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequency")
	@Id
	private Long id;

	@Column(name = "CLIENT_NAME")
	private String name;

	@Column(name = "CLIENT_BIRTH_DATE")
	private LocalDate birthDate;

	@Column(name = "CLIENT_CPF")
	private String cpf;

	@Column(name = "CLIENT_CNPJ")
	private String cnpj;

	@Column(name = "CLIENT_REMUNERATION")
	private Long remuneration;

	@Column(name = "CLIENT_JOB")
	private String job;

	@Column(name = "CLIENT_FORMATION")
	private String formation;

	@Column(name = "ALTERATION_DATE")
	private LocalDate alterationDate;

	@OneToOne(cascade = { CascadeType.ALL })
	private Contact contact;

	@OneToOne(cascade = { CascadeType.ALL })
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
