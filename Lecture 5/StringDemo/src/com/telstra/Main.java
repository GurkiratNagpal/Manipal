package com.telstra;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java World";
		
		String str2 = "Java World";
		
		String str3 = new String("Java world");
		
		System.out.println(str1==str2);
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3)); //case sensitive
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equals(str2));
		
		
		String str4 = "	Welcome ";
		System.out.println(str4.charAt(5));
		System.out.println(str4.length());
		System.out.println(str4.toLowerCase());
		System.out.println(str4.toUpperCase());
		str4 = "Gurkirat";
		System.out.println(str4.substring(1, 4));
		System.out.println(str4.replace('a', 'e'));
		System.out.println(str4.replaceAll("Gu", "Grur"));
		System.out.println();
		
		int i=10;
		String str = String.valueOf(i);
		str = "Welcome to my life nnotre";
		System.out.println(str.split(" "));
		
		
		StringTokenizer st = new StringTokenizer("http:\\22:345:23:21", ":");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		

	}

}
