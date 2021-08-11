package com.telstra;

public class Main {
	public static void main(String[] args) {
		
		Player p1 = new Player(123, "Gurkirat");
		Player p2 = new Player(456, "Nagpal");
		
		p1.md.roll();
		//System.out.println(p1.md.getdValue());
		System.out.println("Player 1 scores total of: "+ p1.getScores());
		p2.md.roll();
		//sSystem.out.println(p2.md.getdValue());
		System.out.println("Player 1 scores total of: "+ p2.getScores());
		if (p1.getScores()> p2.getScores()) {
			System.out.println("Player 1 won!!!");
		}
		else if (p1.getScores()< p2.getScores()) {
			System.out.println("Player 2 won!!!");
		}
		else {
			System.out.println("It's a draww!!!");
		}
		
		
	}

}
