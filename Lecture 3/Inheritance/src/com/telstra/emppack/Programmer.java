package com.telstra.emppack;

public class Programmer extends Employee {
	private int proj;
	private String skill;
	public Programmer(int empID, String empName, int bSalary, int proj, String skill) {
		super(empID, empName, bSalary);
		this.proj = proj;
		this.skill = skill;
		
	}
	public String getDetails() {
		return super.getDetails()+ "  " + proj +"  "+ skill;
	
	
}
	public int getProj() {
		return proj;
	}
	public String getSkill() {
		return skill;
	}
}
