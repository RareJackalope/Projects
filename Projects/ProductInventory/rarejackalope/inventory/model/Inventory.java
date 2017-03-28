package rarejackalope.inventory.model;

import java.util.Locale;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import rarejackalope.inventory.InventoryUtil;

public class Inventory 
{
	private ObservableList<Product> productData = FXCollections.observableArrayList();
	
	public Inventory()
	{
		productData.add(new Product("Toyota Corolla",25000.00,3));
		productData.add(new Product("Toyota 86",30000.00, 5));
		productData.add(new Product("Ford CMax", 27500.00,1));
		productData.add(new Product("Toyota Yaris",20000.00,2));
	}
	
	public ObservableList<Product> getProductData() 
	{
		return productData ;
	}

	public String getInventoryValue() 
	{
		float totalValue = 0;
		String totalValueString = "";
		for(Product p: productData)
		{
			totalValue += (p.getProductStockAmount() * p.getPricePerProduct());
		}
		
		totalValueString = InventoryUtil.formatValueToTwoDecimalPlaces(totalValue);
		totalValueString = InventoryUtil.formatToLocaleCurrency(Locale.CANADA, totalValueString);
		return totalValueString;
	}
}
