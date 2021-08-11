package com.tels;

public abstract class Classtemp {
	String color;
	double rad;
	
	
	public Classtemp(String color, double rad) {
		super();
		this.color = color;
		this.rad = rad;
	}


	public abstract String paint();

}
