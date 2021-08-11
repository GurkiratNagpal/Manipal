package com.telstra;

public class Player {
	
	private int playerID;
	private String playerName;
	public Modified_dice md = new Modified_dice(2);
	
	public Player(int playerID, String playerName) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
	}
	
		
	public int getScores() {
		return md.gettotaldValue();	
	}

}
