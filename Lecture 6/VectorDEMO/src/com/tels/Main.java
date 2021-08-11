package com.tels;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VECTORS ARE THREAD SAFE
		Vector<String> v = new Vector<String>();
		v.add("Geeta");
		v.add("seeta");
		v.add("Peeta");
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		//even iterator works
		Iterator<String> i = v.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		}

}
