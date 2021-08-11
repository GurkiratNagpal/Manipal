package com.telstra;
import java.util.*;
public class Arrayd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[len];
		int sum =0;

		System.out.println("Enter the elements of array:");
		for(int i=0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print(sum);
		sc.close();
		int min = MinimumArray(arr);
		System.out.println(min);
	}

	public static int MinimumArray(int[] arr1) {
		
		int mini=arr1[0];
		for (int i=1;i<arr1.length;i++) {
			mini = (mini<arr1[i])?mini:arr1[i];
		}
		return mini;
	}
}
