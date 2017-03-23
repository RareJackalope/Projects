package rarejackalope.textProjects.palidrome;

public class FindIfPalidrome {

	public static void main(String[] args) 
	{
		
		System.out.println("'Shoots' is a palidrome?: " + findIfPalidrome("shoots"));
		System.out.println("'Ana' is a palidrome?: " + findIfPalidrome("Ana"));
		System.out.println("'Anna' is a palidrome?: " + findIfPalidrome("Anna"));
	}

	private static boolean findIfPalidrome(String word) 
	{	
		if(word.length() > 2 && word.length() % 2 == 0)
		{
			return findIfPalidromeIfEvenLength(word);
		}
		else
		{
			return findIfPalidromeIfOddLength(word);
		}
	}

	private static boolean findIfPalidromeIfOddLength(String word) 
	{
		String firstHalfOfWord = word.substring(0,getMiddleLetter(word)).toLowerCase();
		String secondHalfOfWord = new StringBuilder(word.substring(getMiddleLetter(word) + 1)).reverse().toString().toLowerCase();
		if(firstHalfOfWord.equals(secondHalfOfWord)) return true;
		return false;
	}

	private static int getMiddleLetter(String word) {
		return word.length() / 2;
	}

	private static boolean findIfPalidromeIfEvenLength(String word) 
	{
		String firstHalfOfWord = word.substring(0,getMiddleLetter(word)).toLowerCase();
		String secondHalfOfWord = new StringBuilder(word.substring(getMiddleLetter(word))).reverse().toString().toLowerCase();
		
		if(secondHalfOfWord.equals(firstHalfOfWord)) return true;
		return false;
	}

}
