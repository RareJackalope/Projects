package rarejackalope.numberProjects.floorCoverage;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class FloorCost 
{
	public static void main(String[] args) 
	{	
		System.out.println("Please enter the dimensions of the floor [w*h].");
		Scanner scanner = new Scanner(System.in);
		List<String> wh = new ArrayList<String>();
		
		wh = getDimensions(scanner);
		float floorArea = calculateFloorArea(wh);
		float costPerTile = getCostPerTile();

		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "CA"));		
		System.out.println("Your tile dimensions would be " + floorArea + " which would cost " + currencyFormat.format(floorArea * costPerTile));
		
	}

	private static float getCostPerTile() {
		Scanner scanner;
		System.out.println("Please enter the cost per tile.");
		scanner = new Scanner(System.in);
		float costPerTile = scanner.nextFloat();
		scanner.close();
		return costPerTile;
	}

	private static float calculateFloorArea(List<String> wh) {
		float w = Float.parseFloat(wh.get(0));
		float h = Float.parseFloat(wh.get(1));
		
		return w * h;
	}
	
	private static List<String> getDimensions(Scanner scanner)
	{
		boolean invalidInput = true;
		String dimensions;
		List<String> wh = new ArrayList<String>();
		while(invalidInput)
		{
			dimensions = scanner.next();
			try
			{
				wh = Arrays.asList(dimensions.split("\\*"));
				invalidInput = false;
			}catch(PatternSyntaxException exc)
			{	
				System.out.println("Please enter the dimensions of the floor [w*h].");
				scanner = new Scanner(System.in);
			}
		}
		return wh;
	}	
}
