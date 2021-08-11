package com.telstra.model.service;

import java.util.ArrayList;

import com.telstra.model.book.Book;
import com.telstra.model.bookop.BookOperations;

public class Bookservices {
	static BookOperations bop = new BookOperations();
	public static String addService(int bid, String n, int bpr, int c) {
		Book b = new Book(bid, n, bpr, c);
		return bop.addBook(b);
		
	}
	
	public static String getBookService(int n) {
		Book b= bop.getAbook(n);
		if(b!=null) {
			return((b.toString()));
		}
		else
		return "Book not found";
	}
	public static ArrayList<Book> allBookService() {
		ArrayList<Book> blist = bop.getAllBooks();
		return blist;
		
	}
	public static long getInvService() {
		 return bop.getInventoryValue();
	}
	
	public static String delBookService(int n) {
		return bop.delBook(n);

	}
	public static String updBookService(int id, int pr) {
		return bop.updateBook(id, pr);

	}
	

}
