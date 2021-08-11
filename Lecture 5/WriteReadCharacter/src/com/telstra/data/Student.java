package com.telstra.data;

public class Student {
	private int studID;
	private String Sname;
	
	
	
	public Student(int studID, String sname) {
		super();
		this.studID = studID;
		Sname = sname;
	}
	public int getStudID() {
		return studID;
	}
	public String getSname() {
		return Sname;
	}
	

}
