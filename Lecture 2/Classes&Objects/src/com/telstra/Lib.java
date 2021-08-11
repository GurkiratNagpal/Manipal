package com.telstra;
import java.util.*;
public class Lib {
	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//Menu driven----> adding a book, removin a book, etc
		Book book1 =new Book(1,100,"java");
		System.out.println(book1);
		book1.setBook_price(300);
		System.out.println(book1);
	}
}
