package com.luan.java8defaultcrudapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8DefaultCrudApplication {

	private static final Logger log = LoggerFactory.getLogger(Java8DefaultCrudApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Java8DefaultCrudApplication.class, args);
		log.info("PROJECT LUAN RUNNING");
	}
}
