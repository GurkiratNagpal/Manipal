package com.telstra;
import java.util.*;
public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[len];
		int sum =0;
		sc.close();
		System.out.println("Enter the elements of array:");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print(sum);
		
	}

}