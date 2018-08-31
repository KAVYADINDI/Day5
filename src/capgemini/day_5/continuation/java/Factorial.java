package capgemini.day_5.continuation.java;

import capgemini.day_5.continuation.exceptions.FactorialException;
import capgemini.day_5.continuation.exceptions.InvalidInputException;

public class Factorial {

	public static int calculateFactorial(int number) throws FactorialException, InvalidInputException {
		int factorial=1;
		if (number < 2)
			throw new InvalidInputException("Number should be greater than 2");
		else
		{
		for (int i = number; i >1; i--) {
			factorial *= i;
			 if (factorial<0)
					throw new FactorialException("Factorial value exceeds the maximum integer datatype value");
		}
		}
		return factorial;
	}

}
