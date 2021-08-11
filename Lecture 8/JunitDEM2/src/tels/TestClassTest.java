package tels;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class TestClassTest {

	@Test
	void test() {
		int val1 =5;
		int val2 =6;
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		String str = new String("abc");
		assertNull(str);
		String str2 = "abc";
		String str3 = "abc";
		assertSame(str3, str2);
		
		
		String[] ea = {"1", "2", "3"};
		String[] ra = {"1", "2", "3"};
		assertArrayEquals(ea, ra);
	}

}
