package com.tels;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Orange");
		l1.add("Red");
		l1.add("Blue");
		
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains("Blue"));
		
		ListIterator<String> s = l1.listIterator(l1.size());
		//traversing in fwd
		/*
		while(s.hasNext()){
			System.out.println(s.next());
		}
		*/
		
		while(s.hasPrevious()) {
			System.out.println(s.previous());
		}		
		ArrayList<String> a1 = new ArrayList<String>();
		ListIterator<String> it1 = a1.listIterator();
		Collections.shuffle(l1);
		System.out.println(l1);
	}

}
