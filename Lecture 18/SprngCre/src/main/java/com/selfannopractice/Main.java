package com.selfannopractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("com/javaconfig/config.xml");
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Book b = con.getBean("Favorite", Book.class);
		b.read();
	}

}
