package com.luan.java8defaultcrudapplication.domain;

public class Contact {
	
	private String phone;
	private String cellPhone;
	private String commercialPhone;
	private String email;
	private String pager;
	
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
}
