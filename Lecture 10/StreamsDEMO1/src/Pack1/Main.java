package Pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		List<Integer> intlist = Arrays.asList(4,3,4,1,2,4,4,5);
		//		//map op through streams
		//		//squaring each elemeny
		//		List<Integer> sqlist= intlist.stream().map(i->i*i).collect(Collectors.toList());
		//		sqlist.forEach(System.out::println);
		List<String> slist = Arrays.asList("SEE", "Me", "sive", "seauty");
		List<String> rlist = slist.stream().filter(i-> i.toUpperCase().startsWith("S"))
				.collect(Collectors.toList());

		rlist.forEach(System.out::println);
		List<String> sorted =slist.stream()
				.sorted()
				.collect(Collectors.toList());
		sorted.forEach(System.out::print);
		List<Integer> intlist = Arrays.asList(4,3,4,1,2,4,4,5);
		//map op through streams
		//squaring each elemeny
		Set<Integer> sqlist= intlist.stream().map(i-> i*i)
				.collect(Collectors.toSet());
		sqlist.forEach(System.out::print);
		intlist.stream().forEach(x->System.out.println(x));
		
		System.out.println();
		//reduce
		int sum= intlist.stream().filter(i->i%2==0).reduce(0, (ans,i)->ans+i);
		System.out.println(sum);
		






	}

}

