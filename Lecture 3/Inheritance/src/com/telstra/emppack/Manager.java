package com.telstra.emppack;

public class Manager extends Employee{
	private int empcount;
	private String dName;
	
	public Manager(int empID, String empName, int bSalary, int empcount, String dName) {
		super(empID, empName, bSalary);
		this.empcount = empcount;
		this.dName = dName;
	}
	public String getDetails() {
		return super.getDetails()+ "  " + dName +"  " + empcount;
	}
	public int getEmpcount() {
		return empcount;
	}
	public String getdName() {
		return dName;
	}
	
	
	}
	


