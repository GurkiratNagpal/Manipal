package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/beanlifecycle/config.xml");

//		Samosa s1 = (Samosa) con.getBean("sam1");
//		System.out.println(s1);
//		System.out.println("*******************");
//		
//		Pizza p1 = (Pizza) con.getBean("p1");
//				System.out.println(p1);
		
		Eg e1 = (Eg) con.getBean("e1");
		System.out.println(e1);
		
		con.registerShutdownHook();
		
		
		
	}

}
