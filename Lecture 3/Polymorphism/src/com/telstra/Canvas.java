package com.telstra;

public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println(c1);
		
		Circle c2 = new Circle(2.5);
		System.out.println(c2);
		
		
		Circle c3 = new Circle("Red");
		System.out.println(c3);
		
		
		Circle c4 = new Circle(4.4, "Maroon");
		System.out.println(c4);
	}

}
