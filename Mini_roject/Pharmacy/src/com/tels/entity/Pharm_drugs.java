package com.tels.entity;

public class Pharm_drugs extends Item {

	private String pharmDrugID;

	public Pharm_drugs(String itemId, String locationID, int units, int price, String pharmDrugID) {
		super(itemId, locationID, units, price);
		this.pharmDrugID = pharmDrugID;
		
	}

}
