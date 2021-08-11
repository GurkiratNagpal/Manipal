package com.tels.entity;

import java.util.ArrayList;

import lombok.Getter;


public class Shelf {
	private int shId;
	private @Getter String shelf;
	Bin[] bin_array = new Bin[2];
 
	
	public Shelf(int sh) {
		super();
		this.shId = sh;
		this.shelf ="L"+sh;
	}
	
	

}
