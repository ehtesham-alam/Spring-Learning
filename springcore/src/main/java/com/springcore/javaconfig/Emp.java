package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Emp {

	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Emp(Samosa samosa) {
		super();
		System.out.println("before" + this.samosa);
		this.samosa = samosa;
		System.out.println("after" + this.samosa);
	}

	public void work() {
		this.samosa.display();
		System.out.println("Employee is working");
	}

	@Override
	public String toString() {
		return "Emp [samosa=" + samosa + "]";
	}

}
