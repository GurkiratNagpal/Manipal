package com.telstra;

import java.util.function.Predicate;

public class Class2 implements Predicate<Object>{

	@Override
	public boolean test(Object t) {
		Integer i = (Integer) t;
		if (i>100)		
			return false;
		else
			return true;
	}

}
