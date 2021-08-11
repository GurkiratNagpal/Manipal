package com.telstra;

import java.util.Objects;

public class date1 {
	private int dd;
	private int yyyy;
	private int mm;
	public date1(int dd, int yyyy, int mm) {
		super();
		this.dd = dd;
		this.yyyy = yyyy;
		this.mm = mm;
	}
	@Override
	public String toString() {
		return "date1 [dd=" + dd + ", yyyy=" + yyyy + ", mm=" + mm + "]";
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		date1 other = (date1) obj;
//		return dd == other.dd && mm == other.mm && yyyy == other.yyyy;
//	}
//	
	
	public boolean equals(Object obj) {
		date1 d = (date1)obj;
		if ((dd==d.dd) && (mm==d.mm))
			return true;
		else
			return false;
	}
		
	public int hashcode(){
		return dd^mm^yyyy;
	}
		

	}
	
	
	