package com.telstra;

import java.util.Scanner;

public class arms {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = sc.nextInt(); //154
     	boolean a1 = arms1(num); 

		System.out.println(a1);

		sc.close();
	}
	public static boolean arms1(int n) {
		
		final int m = n;
		boolean a= false;
		String n_string = String.valueOf(n);
		int sum=0, r=0;
		for (int i =0; i<n_string.length(); i++) {
			r= n%10;
			n = n/10;
			sum += Math.pow(r,n_string.length());
		}
		a = (sum==m)?true:false;
		return a;
	}

	
}