package com.telstra;

public class Longdrive {
	public static void main(String[] args) {


		Car c = new Car(134, "Sedan", 10, 100, "Black");
		System.out.println(c.start());
		if (c.increaseSpeed(60)==-1){
			System.out.println("Alert! Max speed!");
		}
		else
			System.out.println("Yay! Yay! Yay!");

			System.out.println(c.stop());

		}


	}

