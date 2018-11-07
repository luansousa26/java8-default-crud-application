package com.luan.java8defaultcrudapplication.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CONTACT")
@SequenceGenerator(name = "sequency", initialValue = 1, allocationSize = 100)
public class Contact {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequency")
	@Id
	private Long id;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "CELL_PHONE")
	private String cellPhone;

	@Column(name = "COMMERCIAL_PHONE")
	private String commercialPhone;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PAGER")
	private String pager;

	@Column(name = "IDCLIENT")
	private Long idClient;

	@Column(name = "ALTERATION_DATE")
	private LocalDate alterationDate;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getCommercialPhone() {
		return this.commercialPhone;
	}

	public void setCommercialPhone(String commercialPhone) {
		this.commercialPhone = commercialPhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPager() {
		return this.pager;
	}

	public void setPager(String pager) {
		this.pager = pager;
	}

	public Long getIdClient() {
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
