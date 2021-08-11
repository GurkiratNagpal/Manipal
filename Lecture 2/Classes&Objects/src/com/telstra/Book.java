package com.telstra;

public class Book {

	int book_id, book_price;
	String book_name;
	//to construct the object of this class we use constructor
	
	public Book(int book_id, int book_price, String book_name) {
		super();
		this.book_id = book_id;
		this.book_price = book_price;
		this.book_name = book_name;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	@Override 
	// override because it comes from the parent class caleed oBJECT class
	public String toString() {
		return "Book [book_id=" + book_id + ", book_price=" + book_price + ", book_name=" + book_name + "]";
	}
	
	
	
	}
