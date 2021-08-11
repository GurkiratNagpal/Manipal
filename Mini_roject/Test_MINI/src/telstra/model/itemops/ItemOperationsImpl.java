package telstra.model.itemops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import teltsra.model.HealthCare;
import teltsra.model.Item;
import teltsra.model.MedicalSupplies;
import teltsra.model.PharmDrugs;

public class ItemOperationsImpl implements ItemOperations {

	private ArrayList<PharmDrugs> pdlist = new ArrayList<PharmDrugs>();


	@Override
	public String addItems(Item item) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice here: 1. pharma, 2: hcp, 3:medical supplies");
		int choice = sc.nextInt();
		String id = String.valueOf(assignItemId());
		System.out.println("");
		if (choice == 1) {
			pdlist.add(new PharmDrugs(item.getUnits(), item.getItemPrice(), item.getItemLocation(), id));

			try (FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Documents\\qwerty.dat", true);
					ObjectOutputStream out = new ObjectOutputStream(output);

			) {

				// Writing the serilized object into the file

				for (PharmDrugs pd : pdlist) {
					out.writeObject(pd);

				}

				System.out.println("Records written");

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("syso pdlist");
		System.out.print(pdlist);
		System.out.println();
		sc.close();
		return "Added successfully in the list";
	}



	@Override
	public int assignItemId() {
//		System.out.println("Enter id");
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
		System.out.println("Assigning a random ID");
		Random rand = new Random();
		int n = rand.nextInt(500) + 1;
		return n;
	}

//	public String writeToFile1Pharma() {
//
//		try (FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Documents\\qwerty.dat", true);
//				ObjectOutputStream out = new ObjectOutputStream(output);
//
//		) {
//
//			// Writing the serilized object into the file
//
//			for (PharmDrugs pd : pdlist) {
//				out.writeObject(pd);
//
//			}
//
//			System.out.println("Records written");
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "Pharma Written Successfully";
//
//	}
}


