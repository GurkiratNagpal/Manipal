package com.telstra.model.book;

import java.util.ArrayList;
import java.util.HashMap;


import com.telstra.model.bookop.BookOperations;

public class Customer {
	private final int cID;
	public Customer() {
		super();
		this.cID = count++;
	}
	private ArrayList<Book> cart = new ArrayList<Book>();
	private static int count = 1;
	private HashMap<Integer, Integer> biller = new HashMap<Integer, Integer>();
	
	public void addToCart(int bookid, int quantity) {
		BookOperations bop = new BookOperations();
		cart.add(bop.getAbook(bookid));
		biller.put(bookid, bop.getAbook(bookid).getPrice()*quantity);
	}
	
	//delete the cart, map
	
	public long getBill() {
		
		long sum=biller.values().stream().reduce(0, (ans, i)->ans+i);
		return sum;
	}

}
