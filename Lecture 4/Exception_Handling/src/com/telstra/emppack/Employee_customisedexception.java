package com.telstra.emppack;
import com.telstra.Customised_Exception;

public class Employee_customisedexception {
	private int EmpID;
	private int balanceLeave;
	public Employee_customisedexception(int empID, int balanceLeave) {
		super();
		EmpID = empID;
		this.balanceLeave = balanceLeave;
	}
	@Override
	public String toString() {
		return "Employee_customisedexception [EmpID=" + EmpID + ", balanceLeave=" + balanceLeave + "]";
	};
	
	public String applyLeave(int noOfDays) throws Customised_Exception {
		if(balanceLeave<noOfDays)
			throw new Customised_Exception("Leave not sanctioned");
		else
		{
			balanceLeave -= noOfDays;
			return ("Hpapy time!");
		}
		
	}
	

}
