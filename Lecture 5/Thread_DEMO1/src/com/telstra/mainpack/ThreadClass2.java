package com.telstra.mainpack;

public class ThreadClass2 extends Thread {
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i+Thread.currentThread().getName());
			try {
				Thread.sleep(1223);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}

}
