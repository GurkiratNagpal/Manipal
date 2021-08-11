package com.telstra;

public class Car extends Vehicle{


	private int maxspeed;
	private String type;


	public int getMaxspeed() {
		return maxspeed;
	}


	public Car(int regno, String model, int currspeed, int maxspeed, String type) {
		super(regno, model, currspeed);
		this.maxspeed = maxspeed;
		this.type = type;
	}


	@Override
	public int increaseSpeed(int n) {
		// TODO Auto-generated method stub


		if (currspeed+n<maxspeed) {
			currspeed+=n;
		return currspeed;}
		else
			return -1;
	}


	@Override //include inherited fields.
	public String toString() {
		return "Car [maxspeed=" + maxspeed + ", type=" + type + ", regno=" + regno + ", model=" + model + ", currspeed="
				+ currspeed + "]";
	}


}
