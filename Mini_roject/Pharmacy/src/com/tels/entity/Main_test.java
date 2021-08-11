package com.tels.entity;

import java.util.Scanner;

import teltsra.model.Item;
import teltsra.model.PharmDrugs;

public class Main_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warehouse w = new Warehouse();
		System.out.println(w.getItemPrice());
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add a item");
			System.out.println("2. print item");
			System.out.println("3. Exit");

			System.out.println("enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter the following details: units, price, zone");
				int units = sc.nextInt();
				int price = sc.nextInt();
				String location = sc.next();
				Item item = new Item(units, price, location);
				System.out.println("Enter your choice here: 1. pharma, 2: hcp, 3:medical supplies");
				int choice = sc.nextInt();
				String id = String.valueOf(assignItemId());
				System.out.println("");
				if (choice == 1) {
					pdlist.add(new PharmDrugs(item.getUnits(), item.getItemPrice(), item.getItemLocation(), id));

					// serializeArrayList();
					System.out.println(writeToFilePharma());

				}
				System.out.println("syso pdlist");
				System.out.print(pdlist);
				System.out.println();

				break;
			}
			}

		}

		
	}

}
