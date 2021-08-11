package com.telstra.emppack;

import com.telstra.Customised_Exception;

public class Main {
	public static void main(String[] args) {
		Employee_customisedexception e = new Employee_customisedexception(1000,12);
		
		try {
			e.applyLeave(10);
		}
		catch(Customised_Exception er) {
			System.out.println(er.getMessage());
		}
	}

}
