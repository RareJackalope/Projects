package rarejackalope.numberProjects.prime_factorization;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactor 
{
	/*
	 * Prime Factorization - Have the user enter a number and find all Prime Factors (if there are any) and display them.
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to see all of its prime factors");
		Scanner scanner = new Scanner(System.in);
		long number = 0;
		String primeFactors;
		boolean inValidInput = true;
		
		
		while(inValidInput)
		{
			try
			{
				number = scanner.nextLong();
				inValidInput = false;
			} catch (InputMismatchException exc)
			{
				System.out.println("Please enter an integer.");
				scanner = new Scanner(System.in);
			}
		}
		
		primeFactors(number);
	}
	
	
	public static void primeFactors(long number)
	{
		while(number%2==0)
		{
			System.out.print(2 + " ");
			number = number/2;
		}
		
		for (int i = 3; i <= Math.sqrt(number); i+= 2)
		{
			while (number%i == 0)
            {
                System.out.print(i + " ");
                number /= i;
            }
		}
		
		if(number > 2)
		{
			System.out.print(number);
		}
		
	}
}
