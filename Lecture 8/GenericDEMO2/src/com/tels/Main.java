package com.tels;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		System.out.println(Test.sumOfList(ilist));
		List<Object> olist = new ArrayList<Object>();
		olist.add(10.0);
		olist.add(20.0);
		System.out.println(Test.sumofList(olist));
		System.out.println(Test.printList(olist));
		
		System.out.println(Test.maximum(3, 5, 14));
		
		System.out.println(Test.maximum(new Student(1,"q", 12), new Student(11,"qq", 110), new Student(12,"qqq", 112)));
		Student s = new Student(10, "Abhijeet DOUBT", 100);
		System.out.println(Test.updateM(120, s));
	}

}
