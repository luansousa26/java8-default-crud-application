package com.luan.java8defaultcrudapplication.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "TB_CLIENT")
public class Client {
	
	private String name;
	private LocalDate birthDate;
	private String cpf;
	private String cnpj;
	private Long remuneration;
	private String job;
	private String formation;

}
