package com.telstra;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
//		Map<Integer, String>hm = new HashMap<Integer, String>();
//		hm.put(1, "Books");
//		hm.put(2, "Pens");
//		hm.put(10, "Xerox");
//		hm.put(null, "Paper");
//		hm.put(12, null);
//		System.out.println(hm);
//		Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
//		hm.put(1, "Books");
//		hm.put(2, "Pens");
//		hm.put(10, "Xerox");
//		hm.put(null, "Paper");
//		hm.put(12, null);
//		System.out.println(hm);
//		Map<Integer, String>hm = new TreeMap<Integer, String>();
//		hm.put(1, "Books");
//		hm.put(2, "Pens");
//		hm.put(10, "Xerox");
//		hm.put(11, "Paper");
//		hm.put(12, null);
//		System.out.println(hm);
		Map<Integer, String>hm = new Hashtable<Integer, String>();
		hm.put(1, "Books");
		hm.put(2, "Pens");
		hm.put(10, "Xerox");
		//hm.put(null, "Paper");
		//hm.put(12, null);
		System.out.println(hm);
		
	}

}