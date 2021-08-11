package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person(11, 21, "abs@gmail.com", "F", "Mumbai"));
		plist.add(new Person(12, 22, "zbdsgmail.com", "M", "Bangalore"));
		plist.add(new Person(13, 23, "absdz@yahoo.com", "F", "Mumbai"));
		plist.add(new Person(14, 24, "abssde@gmail.com", "M", "Bangalore"));
		plist.add(new Person(15, 25, "abser@gmail.com", "F", "Mumbai"));
		plist.add(new Person(16, 26, "zseryj@gmail.com", "M", "Bangalore"));
		
		boolean areAllMale = plist.stream().allMatch(o->o.getGender().equalsIgnoreCase("M"));
		
		boolean areanyfeMale = plist.stream().anyMatch(o->o.getGender().equalsIgnoreCase("F"));
	
		boolean anyTeen = plist.stream().anyMatch(o->o.getAge()<20);
		
		boolean anyYahoo = plist.stream().noneMatch(p->p.getEmail().endsWith("@yahoo.com"));
		System.out.println(" nONE Match?  " +anyYahoo);
		
		Set<String> sorted_names = plist.stream().map(p->p.getEmail()).collect(Collectors.toCollection(TreeSet::new));
		
		
		System.out.println(sorted_names);
		
		List<String> names = Arrays.asList("Gurkirat", "", "kalo", "Chahat");
		int count = (int) names.stream().filter(o->!(o.isEmpty())).count();
		System.out.println(count);
		
		Random r = new Random();
		r.ints().limit(10).sorted().forEach(System.out::println);
		
		
		List<Integer> num22 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		IntSummaryStatistics stats = num22.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		
		
		
		
		
	}

}
