package tesltra.servicepack;

import telstra.model.itemops.ItemOperationsImpl;
import teltsra.model.Item;

public class ItemServices {
	public static ItemOperationsImpl iop = new ItemOperationsImpl();

	public static String addItemService(String name, int units, double price, String zone, int aisle, String shelf,
			int bin, int category) {
		String location = zone + "-" + String.valueOf(aisle) + "-" + shelf + "-" + String.valueOf(bin);
		Item item = new Item(name, units, price, location);
		return iop.addItems(item, category, null);
	}

	public static String addItemServiceMS(String name, int units, double price, String zone, int aisle, String shelf,
			int bin, int category, String type) {
		String location = zone + "-" + String.valueOf(aisle) + "-" + shelf + "-" + String.valueOf(bin);
		Item item = new Item(name, units, price, location);
		return iop.addItems(item, category, type);
	}

}
