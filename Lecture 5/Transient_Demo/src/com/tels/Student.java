package com.tels;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int id;
	private int m1;
	private int m2;
	private transient int total;
	public Student(int id, int m1, int m2) {
		super();
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = m1+m2;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", total=" + total + "]";
	}
	
	

}
