package com.telstra;

public class Bank {
	public static void main(String[] args) {
		Customer c1 = new Customer("Rohan");
		c1.generateAcc("Savings", 1000, 111);
		Customer c2 = new Customer("Rohit");
		c2.generateAcc("Savings", 10000, 222);
		Customer c3 = new Customer("Rahul");
		c3.generateAcc("Current", 5000, 333);
		
		System.out.println(c1.acc.Deposit(111, 10000));
		System.out.println(c1.acc.Deposit(111, 99999));
		System.out.println(c2.acc.Withdraw(101, 300));
		System.out.println(c2.acc.Withdraw(222, 300));
		System.out.println(c3.acc.Withdraw(333, 30000));
		
		
		System.out.println(c3.acc.getBalance());
		

		
		
		
	}
	
}
