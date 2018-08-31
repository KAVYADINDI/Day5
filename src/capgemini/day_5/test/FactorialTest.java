package capgemini.day_5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_5.java.Factorial;

class FactorialTest {

	@Test
	void test() {
		assertEquals(120,Factorial.calculateFactorial(5));
		assertEquals(0,Factorial.calculateFactorial(1));
		assertEquals(479001600,Factorial.calculateFactorial(12));
		assertEquals(0,Factorial.calculateFactorial(21));
		
	}

}
