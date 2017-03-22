package rarejackalope.textProjects.pigLatin;

public class PigLatin 
{
	
	/*
	 * Pig Latin - Pig Latin is a game of alterations played on the English language game.
	 * To create the Pig Latin form of an English word the initial consonant sound is transposed to the end of the word and an ay is affixed (Ex.: "banana" would yield anana-bay).
	 * Read Wikipedia for more information on rules.
	 */
	public static void main(String[] args) 
	{
		System.out.println(PigLatinize("cabbage"));
	}
	
	public static String PigLatinize(String originalString)
	{
		String pigLatinString = "";
		char firstLetter = originalString.charAt(0);
		originalString = originalString.substring(1);
		
		originalString += firstLetter;
		originalString += "ay";
		pigLatinString = originalString;
		return pigLatinString;
	}
}
