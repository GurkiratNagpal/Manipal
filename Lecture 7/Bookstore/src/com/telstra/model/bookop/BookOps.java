package com.telstra.model.bookop;

import java.util.ArrayList;

import com.telstra.model.book.Book;

public interface BookOps {
	
	String addBook(Book b);
	Book getAbook(int bid);
	ArrayList<Book> getAllBooks();
	String delBook(int bid);
	long getInventoryValue();
	String updateBook(int bid, int newbpr);

}
