package com.tels;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet<>();
		s.add(1);
		s.add("SSSS");
		s.add(12.3);
		s.add(null);
		
		System.out.println(s);
		HashSet<String> s1 = new HashSet<String>();
		s1.add("PUPUP");
		s1.add("qqq");
		s1.add("qqq");
		System.out.println(s1);
		
		Set<String> s3 = new LinkedHashSet<String>();
		s3.add("apples");
		s3.add("bananas");
		s3.add("oranges");
		System.out.println(s3);
		
		Set<String> s2 = new TreeSet<String>();
		s2.add("zero");
		s2.add("one");
		s2.add("two");
		s2.add("eight");
		System.out.println(s2); //alphabetical order
		
		
		
		Set<Person> s4 = new LinkedHashSet<Person>();
		s4.add(new Person(12, 2));
		
		s4.add(new Person(112, 2));
		s4.add(new Person(1312, 2));
		s4.add(new Person(122, 2));
		s4.add(new Person(102, 2));
		
		System.out.println(s4);
		
		
		
	}

}