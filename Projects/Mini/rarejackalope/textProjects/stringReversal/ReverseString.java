package rarejackalope.textProjects.stringReversal;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		System.out.println(ReverseString("cabbages"));
	}
	
	public static String ReverseString(String stringToReverse)
	{	
		String reversedString = "";
		
		for(int i = 0; i < stringToReverse.length(); i++)
		{
			 reversedString += Character.toString(stringToReverse.charAt(stringToReverse.length()- i - 1));
		}
		
		return reversedString ;
	}
}
