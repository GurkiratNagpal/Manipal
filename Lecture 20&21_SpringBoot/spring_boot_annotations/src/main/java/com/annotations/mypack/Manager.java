package com.annotations.mypack;

import org.springframework.stereotype.Component;

@Component
public class Manager {
	public void speaking() {
		System.out.println("My name is XYZ");
	}
}
//this will not be imported manually cause 
//it is in another package 