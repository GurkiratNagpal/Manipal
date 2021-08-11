package com.telstra;

public class Hospital {
	private Newborn[] n= new Newborn[500]; //depending on the hospital capacity
	private int patientNo=0;
	
	public void RegisterNewborn(String name, int months, double weight) {
		n[patientNo]= new Newborn(name,months,weight);
		patientNo+=1;
	}
	

	



	public int getPatientNo() {
		return patientNo;
	}






	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}






	public void setN(Newborn[] n) {
		this.n = n;
	}



	public String generateReport(String rep_name) {
		int mt=0; 
		double wt=0;
		for(Newborn newb:n)
			if (newb.getName()==rep_name) {
				 wt = newb.getWeight();
				 mt = newb.getMonths();
				break;
			}
		double bmi = (wt*mt+wt+10*mt)/100; 
		//any logic can be posted here
		if (bmi<0.2)
			return "Undernourished";
		else if (bmi> 0.4)
			return "Overnourished";
		else 
			return "Properly nutritioned";
	}

}
