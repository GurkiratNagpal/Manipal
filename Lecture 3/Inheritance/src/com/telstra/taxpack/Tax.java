package com.telstra.taxpack;
import com.telstra.emppack.*;
public class Tax {
	
	public static int calcTax(Employee e){
		if (e instanceof Manager) {
			Manager m = (Manager) e;
			return 15000;
		}
		else if (e instanceof Programmer) {
			return 10000;
		}
		else return 0;
		
	}

}
