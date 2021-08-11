package com.telstra;

public class Main {
	public static void main(String[] args) {
		Hospital NewbornSpecialist = new Hospital();
		
		NewbornSpecialist.RegisterNewborn("Rahul", 2, 0.3);
		
		NewbornSpecialist.RegisterNewborn("Ronak", 7, 3);
		
		NewbornSpecialist.RegisterNewborn("Rohit", 3, 0.4);
		
		NewbornSpecialist.RegisterNewborn("Roshan", 1, 0.1);
		System.out.println("Total patients:" + NewbornSpecialist.getPatientNo());
		
		System.out.println(NewbornSpecialist.generateReport("Rahul"));
		System.out.println(NewbornSpecialist.generateReport("Ronak"));
		System.out.println(NewbornSpecialist.generateReport("Rohit"));
		System.out.println(NewbornSpecialist.generateReport("Roshan"));
		
		
	}

}
