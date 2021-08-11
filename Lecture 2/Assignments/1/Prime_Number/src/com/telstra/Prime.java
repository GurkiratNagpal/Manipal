package com.telstra;


import java.util.*;



public class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = sc.nextInt(); //157
//		boolean p1 = prime1(num); //method 1 takes 7 seconds
//		boolean p2 = prime2(num); //method 2 takes 3 seconds
     	boolean p3 = prime3(num); //method 3 takes 2 seconds
//		System.out.println(p1);
//		System.out.println(p2);
		System.out.println(p3);

		sc.close();
	}
	public static boolean prime1(int n) {
		boolean p = true;
		for(int i=2;i<n;i++) {
			p = (n%i!=0)?true:false;
			if (p==false){
				break;
			}
		}
		return p;
	}
	public static boolean prime2(int n) {
		boolean p = true;
		for(int i=2;i<=n/2;i++) {
			p = (n%i!=0)?true:false;
			if (p==false){
				break;
			}
		}
		return p;
	}	
	public static boolean prime3(int n) {
		boolean p = true;
		for(int i=2;i<Math.sqrt(n);i++) {
			p = (n%i!=0)?true:false;
			if (p==false){
				break;
			}
		}
		return p;
	}

}