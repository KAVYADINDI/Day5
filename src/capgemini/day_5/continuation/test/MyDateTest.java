package capgemini.day_5.continuation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import capgemini.day_5.continuation.exceptions.InvalidDayException;
import capgemini.day_5.continuation.exceptions.InvalidMonthException;
import capgemini.day_5.continuation.java.MyDate;

class MyDateTest {
MyDate date1;
MyDate date2;
MyDate date3;
MyDate date4;
MyDate date5;
@BeforeEach
void setUp()
{
	date1= new MyDate(1,11,2018); 
	date2= new MyDate(30,2,2015); 
	date3= new MyDate(29,2,2016); 
	date4= new MyDate(1,13,2018); 
	date4= new MyDate(35,1,2018); 
}
	@Test
	void testWithValidInputs() throws InvalidMonthException, InvalidDayException {
		assertEquals(true,date1.CheckDate());
		assertEquals(true,date3.CheckDate());
	}
	@Test
	void testWithInvalidInputs()
	{
		Exception e;
		e=assertThrows(Exception.class,() -> date2.CheckDate());
		assertEquals("The entered day is invalid",e.getMessage());
		e=assertThrows(Exception.class,() -> date5.CheckDate());
		assertEquals("The entered day is invalid",e.getMessage());
		e=assertThrows(Exception.class,() -> date4.CheckDate());
		assertEquals("The moth entered is invalid",e.getMessage());
		 
	}

}
