package com.telstra;

import java.util.Scanner;

public class Biglibrary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of books");
		int len = sc.nextInt();
		Book[] bookarr= new Book[len];
		for (int i=0; i<bookarr.length; i++) {
			System.out.println("Enter details of the book");
			int book_id = sc.nextInt();
			int book_price = sc.nextInt();
			String book_name= sc.nextLine();
			bookarr[i]=new Book(book_id, book_price, book_name);
		}
		System.out.println("Printing the details");
		
		for(Book book:bookarr) {
			System.out.println(book);
		}
	}

}
