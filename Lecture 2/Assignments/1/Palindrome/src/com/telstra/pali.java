package com.telstra;

import java.util.Scanner;

public class pali {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String s = sc.nextLine();
	    String[] words = s.split(" ");
	    for(String word:words) {
	    	boolean b = Palindrome1(word);
	    	if (b==true){
	    		System.out.println(word);
	    	}
	    }
	   

		sc.close();
	}
	public static boolean Palindrome1(String w) {
		boolean b=false;
		StringBuffer sb = new StringBuffer(w);
		String w2 = sb.reverse().toString();
		b = w2.equals(w)?true:false;
		return b;	
	}
	public static boolean Palindrome2(String w) {
		boolean b=false;
		String reve="";
		for(int i=w.length()-1; i>=0;i--) {

			reve= reve +w.charAt(i);
		}
		b = reve.equals(w)?true:false;
		return b;	
	}
	}

	
