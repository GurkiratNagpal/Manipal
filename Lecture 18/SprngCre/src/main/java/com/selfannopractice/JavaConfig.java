package com.selfannopractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.javaconfig")
public class JavaConfig {
	
	public Shelf getShelf() {
		return new Shelf();
	}
	
	@Bean(name = {"Favorite"})
	public Book getStudent() {
		Book s = new Book(getShelf());
		return s;
	
	}
	
}
