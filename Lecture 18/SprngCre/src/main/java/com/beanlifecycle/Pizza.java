package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@Setter

public class Pizza implements InitializingBean, DisposableBean{
	
	private double pp;

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Setting the bean");
		
	}

	public void destroy() throws Exception {
		System.out.println("Desstrrroyeeer");
	}

}
