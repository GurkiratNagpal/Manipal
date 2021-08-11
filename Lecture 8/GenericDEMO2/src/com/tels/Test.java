package com.tels;

import java.util.List;

public class Test {
	//find sum
	// :upperbound : numbers(Integer/Double/Byte/Long/Short) ---> This is the max class it can go to
	public static Number sumOfList(List<? extends Number> nlist) {

		double s=0.0;
		for (Number n:nlist) {
			s+=n.doubleValue();
		}
		return s;

	}

	//lowerbound: nINtgers ---> we can only take upper hierarchial i.e Object, Number and not DOub
	public static Number sumofList(List<? super Double> llist)
	{

		double s = 0.0;
		for(Object n:llist) {
			s+=((Number)n).doubleValue();
		}
		return s;

	}

	//Ubounded --->> works only with object class---> only object class methods not +-*/
	public static Number printList(List<?> list) {
		for(Object o:list) {
			System.out.print(o);
		}
		return list.size();
	}
	
	//Upperbpun of Comparable<T>
	public static <T extends Comparable<T>> T maximum (T x, T y, T z) {
		T max = x;
		if (y.compareTo(max)>0)
			max=y;
		if (z.compareTo(max)>0) 
			max =z;
		return max; 
			
	}
	public static <T extends Number, U extends Student> U updateM(T x, U y) {
	
		y.setMarks(x.intValue());
		return y;
	}
}

