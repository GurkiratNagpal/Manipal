package com.telstra;

import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> pp= new HashMap<String, Integer>();
		pp.put("Table", 3000);
		pp.put("Sofa", 10000);
		pp.put("Lamp", 200);
		
		//Total investment
		System.out.println(pp.keySet());
		System.out.println(pp.entrySet());
		System.out.println(pp.values());
		int sum =0;
		for(String s:pp.keySet()) {
			sum+= pp.get(s);
			
		}
		System.out.println(sum);
			//customer list, place
	}

}
