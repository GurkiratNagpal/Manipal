package com.telstra;

public class Main {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Mathop op = new Mathop();
//		op2.add(10);
		
		Addthread t1 = new Addthread(op, " THREAD1 ");
		SubtractThread t4 = new SubtractThread(op, " THREAD4");
		SubtractThread t5 = new SubtractThread(op, " THREAD5");
		SubtractThread t6 = new SubtractThread(op, " THREAD6");
		Addthread t2 = new Addthread(op, " THREAD2 ");
		Addthread t3 = new Addthread(op, " THREAD3 ");

	}

}
