package teltsra.model;

import java.io.Serializable;

public class Item implements Serializable {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected int units;
	protected int itemPrice;
	protected String itemLocation;
	protected int id;

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Item(int units, int itemPrice, String itemLocation) {
		super();
		this.units = units;
		this.itemPrice = itemPrice;
		this.itemLocation = itemLocation;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	@Override
	public String toString() {
		return "Item [units=" + units + ", itemPrice=" + itemPrice + ", itemLocation=" + itemLocation + "]";
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemLocation() {
		return itemLocation;
	}

	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}

}
