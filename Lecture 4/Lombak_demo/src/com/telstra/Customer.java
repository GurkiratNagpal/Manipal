package com.telstra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@ToString
public class Customer {
	
	
	
	private @Getter int CustId;
	private @Setter String CustName;
	private int balance;

}
