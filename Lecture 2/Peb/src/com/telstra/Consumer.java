package com.telstra;

public class Consumer {
	private int mtno, unitconsumed, unitprice;

	public Consumer(int mtno, int unitconsumed, int unitprice) {
		super();
		this.mtno = mtno;
		this.unitconsumed = unitconsumed;
		this.unitprice = unitprice;
	}

	@Override
	public String toString() {
		return "Consumer [mtno=" + mtno + ", unitconsumed=" + unitconsumed + ", unitprice=" + unitprice + ", bill=" + this.calbil() + "]";
	}
	
	private int calbil() {
		return unitconsumed*unitprice;
	}
	

}
