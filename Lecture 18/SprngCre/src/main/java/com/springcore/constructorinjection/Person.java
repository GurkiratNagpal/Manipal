package com.springcore.constructorinjection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@ToString

public class Person {
	
	private String pname;
	private int pId;
	private Cert c;
	
	

}
