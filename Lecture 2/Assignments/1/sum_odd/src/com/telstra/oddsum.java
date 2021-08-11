package com.telstra;
import java.util.*;
public class oddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no ");
		int n = sc.nextInt();
		int s= oddsummer(n);
		System.out.println(s);
		sc.close();
	}
	public static int oddsummer(int m) {
		String s = Integer.toString(m);
		int sum =0;
		
		for(int i=0; i<s.length(); i++) {
			char c= s.charAt(i);
			sum+=Character.getNumericValue(c);
			i++;
			
		}
		return sum;
	}
}
