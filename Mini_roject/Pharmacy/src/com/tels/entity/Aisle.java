package com.tels.entity;

import java.util.ArrayList;

public class Aisle {
	
	private int aId;
	private ArrayList<Shelf> shelf_array;
	public Aisle(int aId) {
		super();
		this.aId = aId;
		shelf_array = new ArrayList<Shelf>();
	}
	

}
