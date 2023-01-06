package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Emp emp = (Emp) context.getBean("student");
		System.out.println(emp.getSamosa());
		emp.work();
		
		}

}
