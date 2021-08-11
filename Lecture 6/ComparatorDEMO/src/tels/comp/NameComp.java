package tels.comp;

import java.util.Comparator;

import tels.pers.Person;

public class NameComp implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo(o2.getName()));
	}
	

}
