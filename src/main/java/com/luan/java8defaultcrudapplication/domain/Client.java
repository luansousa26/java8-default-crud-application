package com.luan.java8defaultcrudapplication.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "TB_CLIENT")
public class Client {
	
	private String name;
	private int age;

}
