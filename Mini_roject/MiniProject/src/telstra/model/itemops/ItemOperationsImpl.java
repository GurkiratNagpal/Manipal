package telstra.model.itemops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import teltsra.model.HealthCare;
import teltsra.model.Item;
import teltsra.model.MedicalSupplies;
import teltsra.model.PharmDrugs;

public class ItemOperationsImpl implements ItemOperations {

	private ArrayList<PharmDrugs> pdlist = new ArrayList<PharmDrugs>();
	private ArrayList<HealthCare> hcplist = new ArrayList<HealthCare>();
	private ArrayList<MedicalSupplies> mslist = new ArrayList<MedicalSupplies>();
	private HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

	@Override
	public String addItems(Item item, int category, String type) {
		String id = String.valueOf(assignItemId());
		System.out.println("");
		if (category == 1) {
			pdlist.add(
					new PharmDrugs(item.getName(), item.getUnits(), item.getItemPrice(), item.getItemLocation(), id));
			System.out.println(writeToFilePharm());
			System.out.print(pdlist);
			System.out.println();
			return ("Pharma Drug " + item.getName() + " added successfully");
		}

		if (category == 2) {
			hcplist.add(
					new HealthCare(item.getName(), item.getUnits(), item.getItemPrice(), item.getItemLocation(), id));
			System.out.println(writeToFileHealthCare());
			System.out.print(hcplist);
			System.out.println();
			return "Health Care Product " + item.getName() + " added successfully";
		}

		if (category == 3) {
			mslist.add(new MedicalSupplies(item.getName(), item.getUnits(), item.getItemPrice(), item.getItemLocation(),
					id, type));
			System.out.println(writeToFileMedicalSupplies());
			System.out.print(mslist);
			System.out.println();
			return "Medical Supplies and Equipment: " + item.getName() + " added successfully";
		}

		return null;

	}

	@Override
	public String deleteItems(int itemId) {
		return null;
	}

	@Override
	public String updateItems(int itemId, int upPrice) {
		return null;
	}

	@Override
	public int assignItemId() {
		System.out.println("Assigning a random ID");
		Random rand = new Random();
		int n = rand.nextInt(500) + 1;
		return n;
	}

	public String writeToFilePharm() {
		try (FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Desktop\\pd.dat");
				ObjectOutputStream out = new ObjectOutputStream(output);) {
			for (PharmDrugs pd : pdlist) {
				out.writeObject(pd);
				out.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Data written successfully in Pharma.dat file";
	}

	public String writeToFileHealthCare() {
		try (FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Desktop\\hcp.dat");
				ObjectOutputStream out = new ObjectOutputStream(output);) {
			for (HealthCare hcp : hcplist) {
				out.writeObject(hcp);
				out.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Data written successfully in HealthCare.dat file";
	}

	public String writeToFileMedicalSupplies() {
		try (FileOutputStream output = new FileOutputStream("C:\\Users\\d976833\\Desktop\\ms.dat");
				ObjectOutputStream out = new ObjectOutputStream(output);) {
			for (MedicalSupplies ms : mslist) {
				out.writeObject(ms);
				out.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Data written successfully in MedicalSupplies.dat file";
	}

}