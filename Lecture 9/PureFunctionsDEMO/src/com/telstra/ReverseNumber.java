package com.telstra;

public class ReverseNumber {
	private int n;

	public ReverseNumber(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}
	public int Revnum() {
		int rnum = 0, rem=0;
		while(n!=0) {
			rem = n%10;
			rnum = rnum*10+rem;
			n = n/10;
		}
		return rnum;
		
	}

}
