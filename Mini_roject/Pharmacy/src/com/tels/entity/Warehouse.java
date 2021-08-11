package com.tels.entity;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.stream.Collectors;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Warehouse {

	

	public String getLocation(String currId) {
		String prod_type = currId.split("-")[0];
		ArrayList<Item> prod_list= FileReaderItems.ReadItems(prod_type);
	 // we have to find the item of the given item id from the array list
		
		ListIterator<Item> prod_search = prod_list.listIterator();
		Item CurrItem=null;
		while(prod_search.hasNext()) {
			CurrItem = prod_search.next();
			if(CurrItem.getItemId()==currId){
				break;
			}
		}
		String locId = CurrItem.getLocationID();
		String[] warehouse = locId.split("-");
		int zone = warehouse[0].charAt(0) -'A';
		int aisle =Integer.parseInt(warehouse[1]);
		int shelf = Integer.parseInt(warehouse[2].substring(1));
		int bin = Integer.parseInt(warehouse[3]);
		return ("Zone "+ zone+ " Aisle " +aisle+ "Shelf " +shelf+ "Bin " +bin); 
	}
	
	
	
	public int[] getItemPrice() {
		ArrayList<Item> pd_list= FileReaderItems.ReadItems("pd");
		ArrayList<Item> hcp_list= FileReaderItems.ReadItems("hcp");
		ArrayList<Item> ms_list= FileReaderItems.ReadItems("ms");
		int[] investment = new int[3];
		investment[0] = pd_list.stream().map(i->(i.getPrice()*i.getUnits())).reduce(0, (ans, un)->ans+un);
		investment[1] = hcp_list.stream().map(i->(i.getPrice()*i.getUnits())).reduce(0, (ans, un)->ans+un);
		investment[2] = ms_list.stream().map(i->(i.getPrice()*i.getUnits())).reduce(0, (ans, un)->ans+un);
		return investment;
		}
	
	public int getTotalPrice(ArrayList<Item> item_list) {
		int[] invest = this.getItemPrice();
		int total = 0;
		for(int money:invest) {
			total+=money;
			
		}
		return total;
	}
	

}