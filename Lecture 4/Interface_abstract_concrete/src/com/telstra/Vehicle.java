package com.telstra;

public abstract class Vehicle implements Automobile {
	 protected int regno;
	 protected String model;
	 protected int currspeed;
	
	
	public Vehicle(int regno, String model, int currspeed) {
		super();
		this.regno = regno;
		this.model = model;
		this.currspeed = currspeed;
	}

	
	@Override// over ridden methods can have increased viewability but not be decreased.
	public String start() {
		// TODO Auto-generated method stub
		return "Vehicle started";
	}

	@Override
	public abstract int increaseSpeed(int n);

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Vehicle stopped";
	}

}
