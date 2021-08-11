package com.tels.model;

import java.io.Serializable;

public class Student implements Serializable { //no methods
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sID;
	private String name;
	private int sAge;
	public Student(int sID, String name, int sAge) {
		super();
		this.sID = sID;
		this.name = name;
		this.sAge = sAge;
	}
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", name=" + name + ", sAge=" + sAge + "]";
	}
	
	
	
}
