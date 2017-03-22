package rarejackalope.textProjects.vowelCounter;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class CountVowels 
{
	public enum Vowels
	{
		A(0),E(0),I(0),O(0),U(0);
		
		private int count;
		Vowels(int count)
		{
			this.count = count;
		}
		
		public void incrementCount()
		{
			this.count++;
		}
		
		public int getCount()
		{
			return count;
		}
	}
	/*
	 * Count Vowels - Enter a string and the program counts the number of vowels in the text.
	 * For added complexity have it report a sum of each vowel found.
	 */
	public static void main(String[] args) 
	{
		countVowels(getUserInput());
		for (Vowels vowel : Vowels.values()) 
		{
			System.out.println(vowel.name() + ": "+vowel.getCount());
		}
	}

	private static void countVowels(String userInput) 
	{
		for(int i = 0; i < userInput.length();i++)
		{
			switch(userInput.toLowerCase().charAt(i))
			{
				case 'a':
					Vowels.A.incrementCount();
				break;
				case 'e':
					Vowels.E.incrementCount();
				break;
				case 'i':
					Vowels.I.incrementCount();
				break;
				case 'o':
					Vowels.O.incrementCount();
				break;
				case 'u':
					Vowels.U.incrementCount();
				break;
				default:
				break;
			}
		}
	}

	private static String getUserInput() 
	{
		System.out.println("Please enter some text");
		Scanner scanner = new Scanner(System.in);
		
		return validateInput(scanner);
	}

	private static String validateInput(Scanner scanner) {
		boolean invalidInput = true;
		String userText = "";
		do
		{
			try
			{
				userText = scanner.nextLine();
				invalidInput = false;
			}
			catch(NoSuchElementException exc)
			{
				getUserInput();
			}
			
		}while(invalidInput);
		
		return userText;
	}
}
