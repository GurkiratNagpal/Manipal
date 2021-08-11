package com.telstra;

public class Average {
	public static double avg(int ...numbers) {
		int sum = 0;
		for(int i:numbers) {
			sum+=i;

		}
		return(sum/numbers.length);
	}
	public static double avg(double d,long l, int ...numbers) {
		double sum = d+l;
		for(int i:numbers) {
			sum+=i;

		}
		return(sum/numbers.length+2);
	}
}