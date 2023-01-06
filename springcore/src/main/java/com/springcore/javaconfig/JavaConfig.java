package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	public Samosa getSamosa() {

		return new Samosa();
	}

	@Bean(name = { "student", "temp", "com" })
	public Emp getEmp() {

		// creating a new object
		Emp emp = new Emp(getSamosa());

		return emp;

	}

}
