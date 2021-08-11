package com.telstra.emppack;

public class Employee {
	protected int empID;
	protected String empName;
	protected int bSalary;
	
	
	public Employee(int empID, String empName, int bSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.bSalary = bSalary;
	}
	
	public String getDetails() {
		return empID+" "+empName+" "+bSalary;
	}
}
