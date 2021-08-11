package com.telstra;

public class ReverseString {
	private String s;
    StringBuilder input1 = new StringBuilder();

	public ReverseString(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}
	
	public String RevString() {
        
        input1.append(s);
        input1.reverse();
        return input1.toString();
	}
	
	
}
