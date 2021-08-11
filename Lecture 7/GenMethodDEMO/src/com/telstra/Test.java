package com.telstra;

public class Test {
	
	public static <T> void printArray(T[] alist) {
		for(T ele:alist) {
			System.out.println(ele + "      ");
		}
	}

}
