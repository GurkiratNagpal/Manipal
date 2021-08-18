package com.aopDEMO.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aopDEMO.services.Payment;
import com.aopDEMO.services.PaymentImp;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext con = new ClassPathXmlApplicationContext("com/aopDEMO/services/config.xml");
    	
    	Payment p1 =(Payment) con.getBean("payment");
        
        p1.makePayment();
        
        
    }
}
