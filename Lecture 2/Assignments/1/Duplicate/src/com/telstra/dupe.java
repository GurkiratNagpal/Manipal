package com.telstra;
import java.util.*;
public class dupe {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elemnts: ");
		int n = sc.nextInt();
		int[] arr =new int[n];
		int[] dupe =new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
	    dupe[0]=arr[0];
		int j=1;
		for(int i=0;i<n-1;i++) {
			 if(arr[i]==arr[i+1]) {
				 continue;
			 }
			 else {
				 dupe[j]= arr[i+1];
				 j+=1;
			 }
		}
		System.out.println(Arrays.toString(dupe));
	}
}
