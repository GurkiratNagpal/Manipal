package com.telstra.model.book;

public class Book {
	private int bookId;
	private String bookName;
	private int price;
	private int units;
	public Book(int bookId, String bookName, int price, int units) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.units = units;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public int getPrice() {
		return price;
	}
	public int getUnits() {
		return units;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", units=" + units + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
