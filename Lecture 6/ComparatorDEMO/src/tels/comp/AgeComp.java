package tels.comp;

import java.util.Comparator;

import tels.pers.Person;

public class AgeComp implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()>o2.getAge()) {
			return 1;
			
		}
		else if (o1.getAge()<o2.getAge()) 
			return -1;
		else 
			return 0;
		
	}
	

}
