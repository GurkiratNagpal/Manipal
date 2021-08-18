package com.annotations;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public void sayMyName() {
		System.out.println("My name is Spring");
	}
}
