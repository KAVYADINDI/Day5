package capgemini.day_5.continuation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_5.continuation.exceptions.FactorialException;
import capgemini.day_5.continuation.exceptions.InvalidInputException;
import capgemini.day_5.continuation.java.Factorial;

class FactorialTest {

	@Test
	void testWithValidInputs() throws FactorialException, InvalidInputException {
		assertEquals(120,Factorial.calculateFactorial(5));
		assertEquals(24,Factorial.calculateFactorial(4));
	}
	@Test
	void testWithInvalidInputs()
	{
		Exception e;
		e=assertThrows(Exception.class,() ->Factorial.calculateFactorial(1));
		assertEquals("Number should be greater than 2",e.getMessage());
		e=assertThrows(FactorialException.class,() ->Factorial.calculateFactorial(21));
		assertEquals("Factorial value exceeds the maximum integer datatype value",e.getMessage());
	}

}
