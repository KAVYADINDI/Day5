package capgemini.day_5.continuation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import capgemini.day_5.continuation.exceptions.CountryNotValidException;
import capgemini.day_5.continuation.exceptions.EmployeeNameInvalidException;
import capgemini.day_5.continuation.exceptions.TaxNotEligibleException;
import capgemini.day_5.continuation.java.TaxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs()
			throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		assertEquals(8800, TaxCalculator.calculatTax("Sam", true, 110000), 0.1);
		assertEquals(4800, TaxCalculator.calculatTax("Sam", true, 80000), 0.1);
		assertEquals(2250, TaxCalculator.calculatTax("Sam", true, 45000), 0.1);
		assertEquals(1000, TaxCalculator.calculatTax("Sam", true, 25000), 0.1);
	}

	@Test
	void testCalculateTaxWithInvalidName() {
	Exception e;
	e=assertThrows(Exception.class,() -> TaxCalculator.calculatTax("", true, 110000));
	assertEquals("Employee name is Invalid",e.getMessage());
	e=assertThrows(Exception.class,() -> TaxCalculator.calculatTax(" ", true, 10000));
	assertEquals("Employee name is Invalid",e.getMessage());
	}

	@Test
	void testCalculateWithIneligible() {
		Exception e;
		e=assertThrows(Exception.class,() ->TaxCalculator.calculatTax("Sam", true, 5000));
		assertEquals("The Tax is not Eligble",e.getMessage());
	}

	@Test
	void testCalculateTaxWithInvalidCountry() {
		Exception e;
		e=assertThrows(Exception.class,() ->TaxCalculator.calculatTax("Sam", false, 25000));
		assertEquals("The Country of the Employee is not valid",e.getMessage());
	}

}
