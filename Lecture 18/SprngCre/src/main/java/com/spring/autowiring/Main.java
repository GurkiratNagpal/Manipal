package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext co = new ClassPathXmlApplicationContext("com/spring/autowiring/config.xml");
		
		//Address a1 = (Address) co.getBean("eAdd");
		
		
		Emp e1 = (Emp) co.getBean("e2");

		System.out.println(e1);

	}

}
