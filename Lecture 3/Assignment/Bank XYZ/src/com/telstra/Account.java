package com.telstra;
import java.util.*;
public class Account {
	//class Account : with memebers variables like AccountId,AccountType, Balance Amount, etc. etc.
	//  Bind the methods withdraw() and Deposit() which can update Balance Amount

	private int AccountId;
	private String AccountType;
	private double Balance;
	private int pin;

	Random r = new Random();
	public Account(String accountType, double balance, int p) {
		super();
		AccountId = r.nextInt(20000)+15000;
		this.AccountType = accountType;
		this.Balance = balance;
		this.pin = p;
	}

	public int getAccountId() {
		return AccountId;
	}

	public String Withdraw(int p,int money) {
		if (this.pin==p)
			if(money<=Balance) {
				Balance -=money;
				return ("Transaction succ. Rem Balance="+ Balance);
			}
			else {
				return ("Transaction unsucc. Insufficient funds");	
			}
		else
			return "Wrong PIN";

	}

	public String Deposit(int p,int money) {
		if (this.pin==p)
			if(money<=10000) {
				Balance +=money;
				return ("Transaction succ. New Balance="+ Balance);
			}
			else {
				return ("Transaction unsucc. Deposit Limit Reached");	
			}
		else
			return "Wrong PIN";
	}

	public double getBalance() {
		return Balance;
	}



}


