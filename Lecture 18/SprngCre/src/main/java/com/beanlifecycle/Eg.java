package com.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@ToString
public class Eg {
	
	private String sub;
	
	
	@PostConstruct
	public void a() {
		System.out.println("Annotational start");
	}

	
	
	@PreDestroy
	public void b() {
		System.out.println("Annotational end");
	}

}
