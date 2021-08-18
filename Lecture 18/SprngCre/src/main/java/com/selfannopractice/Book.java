package com.selfannopractice;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component("first")

@AllArgsConstructor


public class Book {
	
	public Shelf shelf;
	
	public void read() {
		this.shelf.display();
		System.out.println("Can u read me? zzzzzzzzzzzz");
	}

}
