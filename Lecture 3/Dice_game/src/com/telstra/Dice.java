package com.telstra;
import java.util.Random;

public class Dice {
	private int fValue;
	
	public int roll() {
		Random rand = new Random();
		fValue = rand.nextInt(6)+1;
		return (fValue);
	}

	public int getfValue() {
		return fValue;
	}
	
}
