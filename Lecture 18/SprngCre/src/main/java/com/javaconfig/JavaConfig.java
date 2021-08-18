package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.javaconfig")
public class JavaConfig {
	
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"first"})
	public Student getStudent() {
		Student s = new Student(getSamosa());
		return s;
	
	}
	
}
