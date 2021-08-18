package com.beanlifecycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@AllArgsConstructor

public class Samosa {
	private int quantity;
	private double price;
	
	
	public void initiator() {
		System.out.println("Hello");
	}
	
	public void destroyer() {
		System.out.println("bye");
	}


}
