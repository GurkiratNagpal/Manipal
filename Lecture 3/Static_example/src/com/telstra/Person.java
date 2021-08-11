package com.telstra;
import java.util.Random;
public class Person {
	private final int pID;
	private String pName;
	private int pAge;
	//private static int count;
	private static int count;
	static {
		count = 0;	
	}
	public static int getCount() {
		Random rand = new Random();
		count = rand.nextInt(4000)+1000;
		return count;
	}
	
	public Person(String pName, int pAge) {
		super();
		this.pID=getCount();
		this.pName = pName;
		this.pAge = pAge;
		
	}
	@Override
	public String toString() {
		return "Person [pID=" + pID + ", pName=" + pName + ", pAge=" + pAge + "]";
	}
	

}
