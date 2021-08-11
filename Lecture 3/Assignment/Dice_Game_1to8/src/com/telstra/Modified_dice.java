package com.telstra;

import java.util.Random;

public class Modified_dice {

	
	private int count; //Issues count number of dice for each player
	private int[] dValue;
	

	public Modified_dice(int count) {
		super();
		this.count = count;
		this.dValue= new int[count];
	}
	
	
	public void roll() {
		Random r = new Random();
		for(int d:dValue)
			dValue[d] =r.nextInt(8)+1;
	}


	public int gettotaldValue() {
		int total =0;
		for(int d:dValue)
			total +=d;
		return total;
	}


	public int[] getdValue() {
		return dValue;
	}


}
