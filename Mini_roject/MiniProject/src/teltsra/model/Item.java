package teltsra.model;

import java.io.Serializable;

public abstract class Item implements Serializable {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected int units;
	protected double itemPrice;
	protected String itemLocation;
	protected int id;
	
	protected String name;
	
	abstract String getId();
	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public Item(String name, int units, double itemPrice, String itemLocation) {
		super();
		this.name = name;
		this.units = units;
		this.itemPrice = itemPrice;
		this.itemLocation = itemLocation;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ",  units=" + units + ", itemPrice=" + itemPrice + ", itemLocation="
				+ itemLocation + "]";
	}



	public String getItemLocation() {
		return itemLocation;
	}


}
