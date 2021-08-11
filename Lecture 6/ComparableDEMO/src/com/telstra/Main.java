package com.telstra;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(10, "Ramesh"));
		slist.add(new Student(10, "Suresh"));
		slist.add(new Student(10, "Vignesh"));
		slist.add(new Student(10, "Ravanesh"));
		slist.add(new Student(14, "Ajotesh"));
		
		System.out.println(slist);
		Collections.sort(slist);
		System.out.println(slist);

	}

}
