package com.telstra;

import java.util.function.Function;

public class Class1 implements Function<Integer, Long>{

	@Override
	public Long apply(Integer t) {
		Long res = t.longValue()+15L;
		return res;
	}

}
