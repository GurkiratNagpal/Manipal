package com.aopDEMO.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class myAspect {
	@Before("execution(* com.aopDEMO.services.PaymentImp.makePayment())")
	public void pB() {
		System.out.println("Making payment");
	}
	@After("execution(* com.aopDEMO.services.PaymentImp.makePayment())")
	public void aB() {
		System.out.println("Making payment");
	}

}
