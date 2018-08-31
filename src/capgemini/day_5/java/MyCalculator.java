package capgemini.day_5.java;

import java.util.Scanner;

import capgemini.day_5.exceptions.NegativeIntegerException;
import capgemini.day_5.exceptions.ZeroIntegerException;

public class MyCalculator {
	public static long calculatePower(int n, int p) {
		long power;
		try {
			checkForValidInput(n,p);
			power=(long)Math.pow(n, p);
			return power;
		} catch (ZeroIntegerException | NegativeIntegerException e) {
			System.out.println(e.getMessage());
		} 
		 return 0;
	}
	
	private static void checkForValidInput(int n, int p) throws  ZeroIntegerException,NegativeIntegerException
	{
		if(n==0 && p==0) {
            throw new ZeroIntegerException("n and p should not be zero.");
        } else if(n<0 || p<0) {
            throw new NegativeIntegerException("neither n nor p should not be negative.");	
	}

}
}
