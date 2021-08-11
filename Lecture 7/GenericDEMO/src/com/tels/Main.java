package com.tels;

public class Main {
	public static void main(String[] args) {
		Test<String, String> ob1 = new Test<String, String>();
		ob1.setOb1("Kya kar");
		ob1.setOb2("Phineas");
		System.out.println(ob1);
		
		Test<Integer,String> ob2 = new Test<Integer, String>(10, "Gu");
		System.out.println(ob2);
	}

}
