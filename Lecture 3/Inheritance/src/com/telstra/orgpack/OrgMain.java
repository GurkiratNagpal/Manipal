package com.telstra.orgpack;
import com.telstra.emppack.*;
import com.telstra.taxpack.*;
public class OrgMain {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Gureo ", 10000);
		System.out.println(e1.getDetails());
		
		Manager m1 = new Manager(101, "Jake", 19038, 40, "Communication");
		System.out.println(m1.getDetails());
		
		Programmer p1 = new Programmer(102, "Cewl", 28623, 2, "Dance");
		System.out.println(p1.getDetails());
		//baseclass ref to derived class instance
		Employee e = new Manager(11, "Jakeperlat", 19031238, 40, "HR");
		System.out.println(e.getDetails());
		
		Manager m = (Manager)e;
		System.out.println(m.getdName());
		
		
		//array ---> heterogeneous due to IS-A relationship between children and its base class
		Employee[] emparr = new Employee[4];
		emparr[0] = new Employee(1, "A", 100);
		emparr[1]= new Manager(2, "B", 200, 20, "Hr");
		emparr[2] = new Programmer(10, "Akash", 10000, 2 , "Py");
		emparr[3]= new Manager(22, "BYm", 2000, 5, "Pr");
		for(Employee w:emparr) {
			System.out.println(w.getDetails() + "   "+ Tax.calcTax(w));
		}
	}

}
