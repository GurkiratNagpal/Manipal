package com.telstra.mainpack;

import com.telstra.threadpack.ThreadClass1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass1 tc1 = new ThreadClass1();
		Thread t1 = new Thread(tc1);
		t1.setName(" AAAA ");
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(tc1);
		t2.setName(" BBBB  ");
		t2.start();
		
		System.out.println("WOw");
		//t2.yield();

		Thread t3 = new Thread(tc1);
		t3.setName(" CCCC ");

		t3.start();
		//main thread
		System.out.println("I''m working!");
	
		
		
		
		//ThreadClass2 tc2= new ThreadClass2();
//		Thread t4 = new Thread(tc2);
//		t4.setName(" DDDD ");
//		t4.start();
//		

	}

}
