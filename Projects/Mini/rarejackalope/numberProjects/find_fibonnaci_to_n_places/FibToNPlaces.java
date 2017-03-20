package rarejackalope.numberProjects.find_fibonnaci_to_n_places;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibToNPlaces {
	/*
	 * Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.
	 */
	public static void main(String[] args) 
	{
		System.out.println("Generate the fibonacci sequence to how many places? (0 to 1000)");
		Scanner scanner = new Scanner(System.in);
		int numberOfPlaces = 0;
		boolean invalidInput = true;
		
		
		
		while(invalidInput)
		{
			try
			{
				numberOfPlaces = scanner.nextInt();
				invalidInput = false;
			}
			catch(InputMismatchException exc)
			{
				System.out.println("\nPlease enter a number between 0 and 1000");
				scanner = new Scanner(System.in);
			}
			
			if((numberOfPlaces < 0) || (numberOfPlaces > 1000) && !invalidInput)
			{
				System.out.println("\nPlease enter a number between 0 and 1000");
				scanner = new Scanner(System.in);
				invalidInput = true;
			}
		}
		
		for(int i = 1; i < numberOfPlaces; i++)
		{
			System.out.print(generateFibonacci(i) + ", ");
		}
	}
	
	public static long generateFibonacci(int number)
	{
		if(number == 1 || number == 2)
		{
			return 1;
		}
		return generateFibonacci(number - 1) + generateFibonacci(number - 2);
	}

}
