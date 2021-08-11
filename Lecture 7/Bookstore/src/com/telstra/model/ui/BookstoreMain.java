package com.telstra.model.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.telstra.model.book.Book;
import com.telstra.model.bookop.BookOperations;
import com.telstra.model.service.Bookservices;

public class BookstoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookOperations bop = new BookOperations();

		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("1. Add a Book");
			System.out.println("2. Get a Book");
			System.out.println("3. List of Books");
			System.out.println("4. Delete a Book");
			System.out.println("5. Update a Book price");
			System.out.println("6. Get Inventory Value");
			System.out.println("7. Add to Cart");
			System.out.println("8. Get Bill");
			System.out.println("9. Delete from cart");
			System.out.println("10. EXIT");

			System.out.println("Enter your choice");
			int choice = scanner.nextInt();

			switch(choice){
			case 1:
			{
				System.out.println("Enter details for the book");
				int bid = scanner.nextInt();
				String n = scanner.next();
				int bpr = scanner.nextInt();
				int c = scanner.nextInt();
				
				System.out.println(Bookservices.addService(bid, n, bpr, choice));
				break;
			}
			case 2:
			{	System.out.println("Enter Book Id: ");
				int bid = scanner.nextInt();
				System.out.println(Bookservices.getBookService(bid));

				break;
			}
			case 3:
			{
				System.out.println("Showing all details");
				ArrayList<Book> blist = Bookservices.allBookService();
				for(Book b:blist)
					{
					
					System.out.println(b);
					
					}
				break;
			}
			case 4:
				System.out.println("Enter Book Id: ");
				int bid = scanner.nextInt();
				System.out.println(Bookservices.delBookService(bid));
				
			{
				break;
			}
			case 5:
			{
				
				System.out.println("Enter Book Id: ");
				int bin = scanner.nextInt();
				System.out.println("Enter Book's new price: ");
				int newbpr = scanner.nextInt();
				System.out.println(Bookservices.updBookService(bin, newbpr));
				break;
			}
			case 6:
			{
				
				System.out.println("Total Inventory Value: "+ Bookservices.getInvService());
				break;
			}

			default:

				System.out.println("Bye");
				System.exit(0);
			}

		}

	}

}
