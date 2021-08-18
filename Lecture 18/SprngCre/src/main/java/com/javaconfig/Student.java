package com.javaconfig;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component("first")

@AllArgsConstructor


public class Student {
	
	public Samosa samosa;
	
	public void study() {
		this.samosa.display();
		System.out.println("Studyoinh zzzzzzzzzzzz");
	}

}
