package com.telstra;

public class Stadium {
	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		int p1score = p1.play();
		System.out.println(p1.getScoreD1());
		System.out.println(p1.getScoreD2());
		System.out.println("total scores of player 1:"+ p1score);
		int p2score = p2.play();
		System.out.println(p2.getScoreD1());
		System.out.println(p2.getScoreD2());
		System.out.println("total scores of player 2:"+ p2score);
		if (p1score> p2score) {
			System.out.println("Player 1 won!!!");
		}
		else if (p1score< p2score) {
			System.out.println("Player 2 won!!!");
		}
		else {
			System.out.println("It's a draww!!!");
		}
		
		
		
	}

}
