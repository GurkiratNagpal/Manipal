package com.telstra;

import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> strar = new ArrayList<String>();
//		strar.add("Cudie");
//		strar.add("Cudie");
//		strar.add("Maey");
//		strar.add("Cytee");
//		strar.add("Jakes");
//		strar.add("HOlten");
//		strar.add("IDk");
//		System.out.println(strar);
//		strar.add(1, "Mahesh");
//		System.out.println(strar);
//		strar.remove(3);
//		System.out.println(strar);
//		strar.add(3, "Naresh");
//		System.out.println(strar);
//		strar.remove("Cudie");
//		System.out.println(strar);
//		List<String> a2 = new ArrayList<String>();
//		a2.add("A");
//		a2.add("B");
//		strar.addAll(1, a2);
//		System.out.println(strar);
//		System.out.println(strar.get(3));
//		
//		
//		//Enhanced
//		for(String s:strar) {
//			System.out.print(s);
//		}
//		for (int i=0; i<strar.size(); i++) {
//			System.out.print(strar.get(i));
//		}
//		
//		Iterator<String> it = strar.iterator();
//		while (it.hasNext()){
//			System.out.print(it.next().toUpperCase());
//		}
//		
//		
		//add elements
		
		ArrayList<Integer> sm = new ArrayList<Integer>();
		sm.add(1);
		sm.add(10);
		sm.add(12);
		sm.add(13);
		sm.add(14);
		sm.add(14);
	
		int s =0;
		Iterator<Integer> sum= sm.iterator();
		while(sum.hasNext()) {
			s+=sum.next();
			
		}
			System.out.println(s);
	
	List<String> strar = new ArrayList<String>();
	strar.add("Cudie");
	strar.add("Cudie");
	strar.add("Maey");
	strar.add("Cytee");
	strar.add("Jakes");
	strar.add("HOlten");
	strar.add("IDk");
	System.out.println(strar);
	Collections.sort(strar);
	System.out.println(strar);
	
	
	List<Person> lp = new ArrayList<Person>();
	lp.add(new Person(10,22));
	lp.add(new Person(1230,22));
	lp.add(new Person(10,2452));
	for(Person p:lp) {
		System.out.println(p);
	}
	
	
	
	
	
	
	
	
	
	
	
}
}