package com.telstra;

public class Player {
	private Dice d1 = new Dice();
	private Dice d2= new Dice();
	
//	public Player() {
//		d1 = new Dice();
//		d2 = new Dice();
//	}
	public int play() {
		return (d1.roll()+d2.roll());
	}
	public int getScoreD1() {
		return (d1.getfValue());
	}
	public int getScoreD2() {
		return (d2.getfValue());
	}

}
