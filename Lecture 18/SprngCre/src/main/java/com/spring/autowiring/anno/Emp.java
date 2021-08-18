package com.spring.autowiring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

public @Data class Emp {
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	

}
