package com.luan.java8defaultcrudapplication.service.dto;
import java.io.Serializable;
import java.time.LocalDate;

public class ContactDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String phone;

	private String cellPhone;
	
	private String commercialPhone;
	
	private String email;
	
	private String pager;
	
	private Long idClient;
	
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
