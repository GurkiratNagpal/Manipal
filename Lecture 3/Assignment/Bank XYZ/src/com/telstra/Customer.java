package com.telstra;

import java.util.Random;

public class Customer {
	private int custId;
	private String custName;
	public Account acc;
	public Customer(String custName) {
		super();
		this.custName = custName;
	}
	
	
	public void generateAcc(String type, double balance, int pin) {
		acc = new Account(type, balance, pin);
		System.out.println("Account created! Thankyou! Your Acc Number is  "+ acc.getAccountId()); 
		Random r = new Random();
		this.custId= r.nextInt(100)+50;
		System.out.println("Customer ID: "+ this.custId);
		
	}
	
	
	
	
	

}
