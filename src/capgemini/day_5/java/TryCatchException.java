package capgemini.day_5.java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException 
{
public static void main ( String [] args)
{
	int integer1;
	int integer2;
	int division;
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter 2 integers: ");
	try(Scanner scan=new Scanner(System.in))
	{
		System.out.println("Enter 2 integers: ");
		integer1 = scan.nextInt();
		integer2 = scan.nextInt();
		division =integer1/integer2;
		System.out.println("Thr result is: "+ division);
	}
	catch(InputMismatchException | ArithmeticException e)
	{
		if(e instanceof ArithmeticException)
	    System.out.println("Diivsor should not be zero.");
		else if (e instanceof InputMismatchException)
			System.out.println("Please provide a valid input.");
}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
}
}
