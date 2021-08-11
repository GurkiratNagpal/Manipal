package com.telstra;

public class MyLambdaExp {
	public static void main(String[] args) {
		Mylm m = (a,b)-> (a+b);
		System.out.println(m.add(10,20));
	}

}
