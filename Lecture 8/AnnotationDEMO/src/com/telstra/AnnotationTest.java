package com.telstra;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class AnnotationTest {
//4 annotations @Before, @After, @BeforeClass, @AfterClass
	@BeforeClass
	public static void beforecl() {
		System.out.println("Works once before test case");
	}
	
	
	@AfterClass
	public static void aftercl() {
		System.out.println("Works once after test case");
	}
	
	@Before
	public void before() {
		System.out.println("Works before every test case");
	}
	
	@After
	public void after() {
		System.out.println("Works after every test case");
	}
	
	@Test
	public void test1() {
		System.out.println("In test 1");
		
	}

	@Test
	public void test2() {
		System.out.println("In test 2");
		
	}
	
}