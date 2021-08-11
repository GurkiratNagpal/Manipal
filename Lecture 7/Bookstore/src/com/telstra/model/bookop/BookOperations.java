package com.telstra.model.bookop;

import java.util.ArrayList;
import java.util.HashMap;

import com.telstra.model.book.Book;

public class BookOperations implements BookOps{
	private ArrayList<Book> blist = new ArrayList<Book>();
	HashMap<Integer, Integer> bmap= new HashMap<Integer, Integer>() ;       //key--> book id, value---> price*units
;	@Override
	public String addBook(Book b) {
		// TODO Auto-generated method stub
	
	
		blist.add(b);
		bmap.put(b.getBookId(), b.getPrice()*b.getUnits());
		return "Book added successfully";
	}

	@Override
	public Book getAbook(int bid) {
		for(Book b:blist) {
			if(b.getBookId()==bid) {
				return b;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return blist;
	}

	@Override
	public String delBook(int bid) {
		// TODO Auto-generated method stub
		Book b = getAbook(bid);
		if (b!=null) {
			blist.remove(b);
			bmap.remove(bid);
			return "Book deleted";
		}
		return "Not found";
	}

	@Override
	public long getInventoryValue() {
		long totamt = 0;
		for(Integer i:bmap.keySet()) {
			totamt  += bmap.get(i);
		}
		return totamt;
	}

	@Override
	public String updateBook(int bid, int newbpr) {
		Book b = getAbook(bid);
		if (b!=null) {
			
			b.setPrice(newbpr);
			bmap.put(b.getBookId(), b.getPrice()*b.getUnits());
			return "Price updated successfully";
		}
		else
		return "Book is unavailable";
	}
	
	

}