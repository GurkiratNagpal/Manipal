package com.annotations;

public class Student {
	String name;
	
	public Student() {
		super();
		
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public void studying() {
		System.out.println(this.name + "I am studying ");
	}

}
