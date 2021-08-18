package com.spring.autowiring.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext co = new ClassPathXmlApplicationContext("com/spring/autowiring/anno/config.xml");
		
		//Address a1 = (Address) co.getBean("eAdd");
		
		
		Emp emp = (Emp) co.getBean("e2");

		System.out.println(emp);

	}

}
