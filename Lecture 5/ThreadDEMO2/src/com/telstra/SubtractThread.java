package com.telstra;

public class SubtractThread implements Runnable {
	
	private Mathop op;
	private Thread t1;
	public SubtractThread(Mathop op, String threadname) {
		super();
		this.op = op;
		this.t1 = new Thread(this);
		this.t1.setName(threadname);
		this.t1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		op.sub(5);
		System.out.println(Thread.currentThread().getName());
	}
		
	}

