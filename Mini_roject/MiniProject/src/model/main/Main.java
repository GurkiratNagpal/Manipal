package model.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import teltsra.model.Warehouse;
import tesltra.servicepack.ItemServices;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		while (true) {

			//			// Category
			//			System.out.println();
			//			System.out.println("Available item types are:");
			//			System.out.println("1. Pharmaceutical Drugs");
			//			System.out.println("2. Health and personal care products");
			//			System.out.println("3. Medical Supplies and Equipments");
			//			System.out.println();
			//			System.out.println("Select one of the above types");
			//			int category = sc.nextInt();
			//			if (!(categorySet.contains(category))) {
			//				System.out.println("Invalid Option. Enter Again!");
			//				continue;
			//			}
			//			System.out.println("You have chosen" + " " + category);
			//
			//			System.out.println();

			// Choice
			System.out.println("Choose on of the following options:");
			System.out.println();
			System.out.println("1. Add an Item");
			System.out.println("2. Get an Item");
			System.out.println("3. Delete an Item");
			System.out.println("4. Update an Item");
			System.out.println("5. Get Location");
			System.out.println("6. Get Price of Each type");
			System.out.println("7. Total Inventory Value");
			System.out.println("8. Exit");
			int choice = sc.nextInt();
			//			if (!(choiceSet.contains(choice))) {
			//				System.out.println("Invalid Option. Enter Again!");
			//				continue;
			//			}
			switch (choice) {
			case 1: {
				System.out.println("Select 1 for Pd; 2 for hcp; 3 for ms");
				int category = sc.nextInt();
				System.out.println(
						"Enter the following details: Name, Number of Units, Price of Each Unit, Zone, Aisle, Shelf, Bin. ");
				String name = sc.next();
				int units = sc.nextInt();
				int price = sc.nextInt();
				String zone = sc.next();
				int aisle = sc.nextInt();
				String shelf = sc.next();
				int bin = sc.nextInt();
				if (category == 3) {
					System.out.println("Enter type of Medical Supply and Equipment");
					String type = sc.next();
					System.out.println(
							ItemServices.addItemServiceMS(name, units, price, zone, aisle, shelf, bin, category, type));
				}

				System.out.println(ItemServices.addItemService(name, units, price, zone, aisle, shelf, bin, category));
				break;
			}

			case 5:{

				System.out.println("Get Location of which Item ID? ");
				String currId = sc.next();
				System.out.println(Warehouse.getLocation(currId));

			}
			case 6:{

				double[] investment =Warehouse.getItemPrice();
				System.out.println(investment.toString());

			}
			case 7:{
				double invest = Warehouse.getTotalPrice();
				System.out.println(invest);
			}


			}


			sc.close();

		}

	}
}
