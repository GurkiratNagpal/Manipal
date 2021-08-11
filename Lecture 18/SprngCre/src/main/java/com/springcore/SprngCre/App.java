package com.springcore.SprngCre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        Student s1 = (Student) con.getBean("student2");
        
        System.out.println(s1);
    	
    	
    	
    	
    	
    	
    }
}
