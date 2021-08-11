package com.telstra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

	Counter c1;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Object initiation wohoo!");
		c1 = new Counter();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Object destruction baam!");
		c1 = null;
	}

	@Test
	public void test() {
		assertTrue(c1.increment()==0);
	}
	public void test1() {
		assertTrue(c1.increment()==0);
	}
}
