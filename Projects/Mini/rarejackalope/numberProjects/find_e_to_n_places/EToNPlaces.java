package rarejackalope.numberProjects.find_e_to_n_places;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EToNPlaces {
	private final static BigDecimal E= new BigDecimal("2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274");
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number of digits you want to see e to (Between 0 and 100):");
		Scanner scanner = new Scanner(System.in);
		boolean invalidInput = true;
		int numberOfPlaces = 0;
		String format;
		
		
		while(invalidInput)
		{
			try
			{
				numberOfPlaces = scanner.nextInt();
				invalidInput = false;
			}
			catch(InputMismatchException exc)
			{
				System.out.println("\nPlease enter an integer between 0 and 100.\n");
				scanner = new Scanner(System.in);
			}
			
			if((numberOfPlaces < 0 || numberOfPlaces > 100) && !invalidInput)
			{
				System.out.println("\nPlease enter an integer between 0 and 100.\n");
				scanner = new Scanner(System.in);
				invalidInput = true;
			}
		}
		
		format = "#.";
		for(int i = 0; i < numberOfPlaces; i++)
		{
			format +="0";
		}
		
		DecimalFormat formatter = new DecimalFormat(format);
		
		System.out.println("E to "+numberOfPlaces+" places is: "+ formatter.format(E));
		
	}

}
