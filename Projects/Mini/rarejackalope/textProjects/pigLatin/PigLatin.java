package rarejackalope.textProjects.pigLatin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PigLatin 
{
	
	/*
	 * Pig Latin - Pig Latin is a game of alterations played on the English language game.
	 * To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay).
	 * Read Wikipedia for more information on rules.
	 */
	public static void main(String[] args) 
	{
		
		List<String> tokenList = parseStringForTokens(getStringToConvert());
		System.out.println(pigLatinize(tokenList));
	}
	
	private static String pigLatinize(List<String> tokenList) 
	{	
		String pigLatinText = "";
		String temp;
		for(int i = 0; i < tokenList.size(); i++)
		{
			temp = tokenList.get(i);
			temp += temp.charAt(0);
			temp = temp.substring(1);
			temp += "ay";
			pigLatinText += temp + " ";
		}
		
		return pigLatinText;
	}

	private static List<String> parseStringForTokens(String stringToConvert) {
		List<String> tokenList = new ArrayList<String>();
		tokenList = Arrays.asList(stringToConvert.split("\\s"));
		return tokenList;
	}

	private static String getStringToConvert() {
		System.out.println("Enter some text to pig latinize.");
		Scanner scanner = new Scanner(System.in);
		return validateInput(scanner);
		
	}

	private static String validateInput(Scanner scanner) 
	{
		boolean invalidInput = true;
		String userInput = "";
		while(invalidInput)
		{
			try
			{
				userInput = scanner.nextLine();
				invalidInput = false;
			}
			catch(NoSuchElementException exc)
			{
				System.out.println("Enter some text to pig latinize");
				scanner = new Scanner(System.in);
			}
		}
		
		return userInput;
	}
}
