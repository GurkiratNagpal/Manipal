package com.telstra;

import java.util.TreeMap;

public class Customer_Main {
	public static void main(String[] args) {
		TreeMap<Customer, String> cm = new TreeMap<Customer, String>();
		cm.put(new Customer(1,"Pou"), "Georgia");
		cm.put(new Customer(21,"Gurri"), "Amritsar");
		cm.put(new Customer(2, "Firus"), "Bengal");
		cm.put(new Customer(3, "Monika"), "Delhi");
		for(Customer c:cm.keySet()) {
			System.out.println(c.getName() + "   "+ cm.get(c));
			
		}
	}

}
