package rarejackalope.numberProjects.find_pi_to_nth_digit;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PiToNthDigit 
{
	private static final BigDecimal PI = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
	
	public static void main(String[] args) 
	{	
		System.out.println("Please enter the place you want to see PI to:");
		Scanner scanner = new Scanner(System.in);
		boolean invalidInput = true;
		int decimalPlace = 0;
		String format;
		
		while(invalidInput)
		{
			try
			{
				decimalPlace = scanner.nextInt();
				invalidInput = false;
			}
			catch(InputMismatchException exc)
			{
				System.out.println("\nPlease enter an integer value between 0 and 100.\n");
				scanner = new Scanner(System.in);
			}
			
			if((decimalPlace < 0 || decimalPlace > 100) && !invalidInput)
			{
				System.out.println("\nPlease enter an integer value between 0 and 100.\n");
				scanner = new Scanner(System.in);
				invalidInput = true;
			}
		}
		
		format = "#.";
		for(int i = 0; i < decimalPlace; i++)
		{
			format +="0";
		}
		
		DecimalFormat formatter = new DecimalFormat(format);
		System.out.println("Pi to "+decimalPlace+" places is: " + formatter.format(PI));
		
		
		
	}
}

