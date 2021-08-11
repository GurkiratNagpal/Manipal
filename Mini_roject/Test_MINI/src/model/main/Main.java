package model.main;

import java.util.Scanner;

import telstra.model.itemops.ItemOperationsImpl;
import teltsra.model.Item;

public class Main {

	public static void main(String[] args) {

		ItemOperationsImpl ioimpl = new ItemOperationsImpl();

//		PharmDrugs d = new PharmDrugs(5, 50, "z1a2", "123");
//		System.out.println(d);
//
//		HealthCare h = new HealthCare(15, 450, "z1a2", "567");
//		System.out.println(h);
//
//		MedicalSupplies m = new MedicalSupplies(15, 450, "z1a2", "567", "surgical");
//		System.out.println(m);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add a item");
			System.out.println("enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter the following details: units, price, zone");
				int units = sc.nextInt();
				int price = sc.nextInt();
				String location = sc.next();
				Item item = new Item(units, price, location);
				ioimpl.addItems(item);

				break;
			}
			}

		}

		// System.out.println();

	}

}