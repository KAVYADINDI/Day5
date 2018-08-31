package capgemini.day_5.continuation.java;

import capgemini.day_5.continuation.exceptions.CountryNotValidException;
import capgemini.day_5.continuation.exceptions.EmployeeNameInvalidException;
import capgemini.day_5.continuation.exceptions.TaxNotEligibleException;

public class TaxCalculator {

	public static double calculatTax(String empName, Boolean isIndian, int empSal)
			throws EmployeeNameInvalidException, TaxNotEligibleException, CountryNotValidException {
		double tax;
		if (isIndian) {
			if (empName == "" || empName == " ")
				throw new EmployeeNameInvalidException("Employee name is Invalid");
			else {
				if (empSal > 100000)
					tax = empSal * 8 / 100;
				else if (empSal >= 50000 && empSal <= 100000)
					tax = empSal * 6 / 100;
				else if (empSal >= 30000 && empSal < 50000)
					tax = empSal * 5 / 100;
				else if (empSal >= 10000 && empSal < 30000)
					tax = empSal * 4 / 100;
				else
					throw new TaxNotEligibleException("The Tax is not Eligble");
			}
		} else
			throw new CountryNotValidException("The Country of the Employee is not valid");

		return tax;
	}

}
