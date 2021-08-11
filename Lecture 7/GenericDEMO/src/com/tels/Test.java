package com.tels;

public class Test<t,u> { //The type of object is decided while creation
	private t ob1;
	private u ob2;
	public Test(t ob1, u ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public Test() {
		super();
	}
	@Override
	public String toString() {
		return "Test [ob1=" + ob1 + ", ob2=" + ob2 + "]";
	}
	public t getOb1() {
		return ob1;
	}
	public void setOb1(t ob1) {
		this.ob1 = ob1;
	}
	public u getOb2() {
		return ob2;
	}
	public void setOb2(u ob2) {
		this.ob2 = ob2;
	}
	
	
	

}
