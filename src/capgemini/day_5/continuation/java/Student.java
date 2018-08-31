package capgemini.day_5.continuation.java;

import capgemini.day_5.continuation.exceptions.AgeNotWithinRangeException;
import capgemini.day_5.continuation.exceptions.NameNotValidException;

public class Student {

	public static boolean inputValidation(long rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		for(int i=0;i<=name.length()-1;i++)
		{
			int a=(int)name.charAt(i);
			if((a>=65 && a<=90)||(a>=97 && a<=122))
				continue;
			else
				throw new NameNotValidException	("Name entered has an integer or a special charecter");
		}
		if(age<15 || age>21)
	throw new AgeNotWithinRangeException ("Entered age is not within the specified range");
		return true;
	}

}
