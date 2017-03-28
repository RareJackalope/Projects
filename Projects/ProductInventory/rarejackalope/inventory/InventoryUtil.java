package rarejackalope.inventory;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class InventoryUtil 
{
	public static <T extends Number>String formatValueToTwoDecimalPlaces(T value)
	{
		NumberFormat formatter = new DecimalFormat("#.00");
		return formatter.format(value);
	}
	
	public static String formatToLocaleCurrency(Locale locale, String valueToFormat)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		return formatter.format(Float.parseFloat(valueToFormat));
	}
}
