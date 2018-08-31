package capgemini.day_5.continuation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_5.continuation.java.MyCalculator1;


class MyCalculatorTest1 {

	@Test
	void testPowerwithValidInputs() throws Exception{
	assertEquals(243,MyCalculator1.power(3,5));
	assertEquals(32,MyCalculator1.power(2,5));
	}
	
	
	@Test
	void testPowerZeroInputs() {
		Exception e;
		e=assertThrows(Exception.class,() -> MyCalculator1.power(0, 0));
		assertEquals("n and p should not be zero",e.getMessage());
	}
	@Test
	 void TestPowerWithNegativeInputs()
	 {	
		Exception e;
	e=assertThrows(Exception.class,() -> MyCalculator1.power(-5, 9));
	assertEquals("n and p should not be negative",e.getMessage());
	e=assertThrows(Exception.class,() -> MyCalculator1.power(-2, -7));// why .class? ----\
	assertEquals("n and p should not be negative",e.getMessage());
	}

}
