package com.telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date1 d1 = new date1(21, 2021, 07);
		date1 d2 = new date1(21, 2021, 07);
		System.out.print(d1.equals(d2)); //comparing references
		date1 d3=d1;
		System.out.print(d3.equals(d1));
		// == only compares references
		System.out.println(d1==d3);
		System.out.println(d1.hashCode() + " " + d2.hashCode() + " "+ d3.hashCode() );
	}

}