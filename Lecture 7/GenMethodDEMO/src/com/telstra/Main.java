package com.telstra;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intarr = {2,3,4,5,5};
		Test.printArray(intarr);
		
		
		Product[] par = {new Product(12, "Pens"), new Product(22, "Pencils"), new Product(1, "Papers")};
		Test.printArray(par);
		
		String[] s= {"hwl","res","wer","wsw"};
		Test.printArray(s);

	}

}