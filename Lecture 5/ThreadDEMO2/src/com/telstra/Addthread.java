package com.telstra;

public class Addthread implements Runnable{
		// TODO Auto-generated method stub
		private Mathop op;
		private Thread t1;
		public Addthread(Mathop op, String threadname) {
			super();
			this.op = op;
			this.t1 = new Thread(this);
			this.t1.setName(threadname);
			this.t1.start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			op.add(10);
			System.out.println(Thread.currentThread().getName());;
			
		}
		
		
		
	

}