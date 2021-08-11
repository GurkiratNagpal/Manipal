package tels.mainpack;

import java.util.ArrayList;
import java.util.Collections;

import tels.comp.AgeComp;
import tels.comp.NameComp;
import tels.pers.Person;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person(10, "Gurkirat", 22));
		plist.add(new Person(13, "Mythli", 25));
		plist.add(new Person(12, "Mohit", 21));
		plist.add(new Person(11, "Gaurav", 2));
		
		Collections.sort(plist,new AgeComp());
		System.out.println(plist);
		Collections.sort(plist,new NameComp());
		System.out.println(plist);
	}

}
