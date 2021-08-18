package com.springcore.constructorinjection;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Add {
	int a;
	int b;
	
	
	
	
	public void dosum() {
		System.out.println(a+b);
	}




	public Add(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("We did double addition!");
	}




	public Add(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String add!!");
	}

}


