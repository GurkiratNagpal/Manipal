package com.telstra.orgpack;
import com.telstra.emppack.*;

public class OrgMain {
	public static void main(String[] args) {
		
		Manager m1 = new Manager(101, "Jake", 19038, 40, "Communication");
		System.out.println(m1.getDetails() + m1.caclsal());
		
		Programmer p1 = new Programmer(102, "Cewl", 28623, 2, "Dance");
		System.out.println(p1.getDetails());
		//baseclass ref to derived class instance
		Employee e = new Manager(11, "Jakeperlat", 19031238, 40, "HR");
//		System.out.println(e.getDetails() + e.caclsal()); // cant use it because proetected in base class, nneed to type cast.
	}

}
