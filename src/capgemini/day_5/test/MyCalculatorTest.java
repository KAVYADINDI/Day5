package capgemini.day_5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_5.java.MyCalculator;

class MyCalculatorTest {

	@Test
	void test() {
		assertEquals(243,MyCalculator.calculatePower(3,5));
		assertEquals(0,MyCalculator.calculatePower(3,-5));
		assertEquals(0,MyCalculator.calculatePower(0,0));
	}

}
