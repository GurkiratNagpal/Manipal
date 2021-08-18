package com.annotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.annotations.mypack.Manager;

@Configuration
@ComponentScan(basePackages = {"com.annotations.mypack"})
public class MyConfig {
	
	@Bean("Student1")
	public Student getStudent() {
		System.out.println("This is the first student");
		return new Student("Student1");
	}
	
	@Bean("Student2")
	public Student createStudent() {
		System.out.println("This is the second student");
		return new Student("Student2");
	}
	
	
	@Bean
	public Date getDate() {
		System.out.println("Create a new date/convince gurri ");
		return new Date();
	}
	
	public Manager manager() {
		System.out.println("The new manager will speak now");
		return new Manager();
	}
}
