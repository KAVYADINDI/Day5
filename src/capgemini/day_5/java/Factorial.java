package capgemini.day_5.java;

import capgemini.day_5.exceptions.FactorialException;
import capgemini.day_5.exceptions.InvalidInputException;

public class Factorial {
	public static int calculateFactorial(int number) {
		try {
		inputValidation(number);
		int factorial=1;
//		System.out.println(Integer.MAX_VALUE);
		for (int i = number; i >1; i--) {
			factorial *= i;
		}
		return factorial;
		}
		catch(FactorialException | InvalidInputException e)
		{
			System.out.println(e.getMessage());
		}
		return 0;
	}

	private static void inputValidation(int number) throws InvalidInputException, FactorialException {
		if (number < 2)
			throw new InvalidInputException("Number should be greater than 2.");
		else if (number>maxIntForFactorial())
			throw new FactorialException("Factorial value exceeds the maximum integer datatype value");
			
	}
	
	private static int maxIntForFactorial() {
		 int res = 2;
	        int fact = 2;
	        while (true)
	        {
	            if (fact < 0)
	                break;
	            res++;
	            fact = fact * res;
	        }
//	        System.out.println(fact+ "    "+res);
	        return res - 1;
	}
}
