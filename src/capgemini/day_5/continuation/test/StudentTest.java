package capgemini.day_5.continuation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_5.continuation.exceptions.AgeNotWithinRangeException;
import capgemini.day_5.continuation.exceptions.NameNotValidException;
import capgemini.day_5.continuation.java.Student;

class StudentTest {

	@Test
	void testWithValidInputs() throws AgeNotWithinRangeException, NameNotValidException {
		assertEquals(true,Student.inputValidation(1234,"Tom",20,"C"));
		assertEquals(true,Student.inputValidation(1234,"tom",20,"C"));
		assertEquals(true,Student.inputValidation(1234,"ToM",20,"C"));
	}
	@Test
	void testWithInvalidAge()
	{
		Exception e;
		e=assertThrows(Exception.class,() ->Student.inputValidation(1234,"Tom",14,"C"));
		assertEquals("Entered age is not within the specified range",e.getMessage());
		e=assertThrows(Exception.class,() ->Student.inputValidation(1234,"Tom",22,"C"));
		assertEquals("Entered age is not within the specified range",e.getMessage());
	}
@Test
void testWithInvalidName()
{
	Exception e;
	e=assertThrows(Exception.class,() ->Student.inputValidation(1234,"S@m",20,"C"));
	assertEquals("Name entered has an integer or a special charecter",e.getMessage());
	e=assertThrows(Exception.class,() ->Student.inputValidation(1234,"T0m",20,"C"));
	assertEquals("Name entered has an integer or a special charecter",e.getMessage());
}
}
