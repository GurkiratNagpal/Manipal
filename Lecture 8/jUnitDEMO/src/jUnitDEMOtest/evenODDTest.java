package jUnitDEMOtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import jUnitDEMO.evenODD;

public class evenODDTest {

	@Test  //Test module J unit external library---> default faces failure always
	public void test() {
		
		evenODD ob = new evenODD();
		assertEquals(true, ob.isEven(10));
		
	}

}
