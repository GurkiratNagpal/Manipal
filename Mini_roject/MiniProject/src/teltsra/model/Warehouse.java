package teltsra.model;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

import telstra.model.itemops.FileReaderItems;
import teltsra.model.Item;

public class Warehouse {

	

	public static String getLocation(String currId) {
		
		String prod_type = currId.split("-")[0];
		ArrayList<Item> prod_list =null;
		if(prod_type.equalsIgnoreCase("pd")) {
			prod_list =new ArrayList<Item>(FileReaderItems.ReadPharmaDrugs());

		}
		if(prod_type.equalsIgnoreCase("hcp")) {
			prod_list =new ArrayList<Item>(FileReaderItems.ReadHealthCare());
					}
		if(prod_type.equalsIgnoreCase("ms")) {
			prod_list =new ArrayList<Item>(FileReaderItems.ReadMedics());
			
		}
	 
		
		ListIterator<Item> prod_search = prod_list.listIterator();
		Item CurrItem=null;
		while(prod_search.hasNext()) {
			CurrItem = prod_search.next();
			if(CurrItem.getId()==currId){
				break;
			}
		}
		String locId = CurrItem.getItemLocation();
		String[] warehouse = locId.split("-");
		int zone = warehouse[0].charAt(0) -'A';
		int aisle =Integer.parseInt(warehouse[1]);
		int shelf = Integer.parseInt(warehouse[2].substring(1));
		int bin = Integer.parseInt(warehouse[3]);
		return ("Zone "+ zone+ " Aisle " +aisle+ "Shelf " +shelf+ "Bin " +bin); 
	}
	
	
	
	public static double[] getItemPrice() {
		ArrayList<PharmDrugs> pd_list= FileReaderItems.ReadPharmaDrugs();

		ArrayList<HealthCare> hcp_list= FileReaderItems.ReadHealthCare();
		ArrayList<MedicalSupplies> ms_list= FileReaderItems.ReadMedics();
		double[] investment = new double[3];
		investment[0] = pd_list.stream().map(i->(i.getItemPrice()*i.getUnits())).reduce(0.00, (ans, un)->ans+un);
		investment[1] = hcp_list.stream().map(i->(i.getItemPrice()*i.getUnits())).reduce(0.00, (ans, un)->ans+un);
		investment[2] = ms_list.stream().map(i->(i.getItemPrice()*i.getUnits())).reduce(0.00, (ans, un)->ans+un);
		return investment;
		}
	
	public static double getTotalPrice() {
		double[] invest = getItemPrice();
		double total = 0;
		for(double money:invest) {
			total+=money;
			
		}
		return total;
	}
	

}
