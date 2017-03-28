package rarejackalope.inventory;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import rarejackalope.inventory.model.Product;

public class ProductUtil 
{
	
	public static boolean isProductInStock(Product product) 
	{
		if(product.productStockAmount() != null && product.getProductStockAmount() > 0) return true;
		return false;
	}

	public static int getId(Product product) 
	{
		return (product.productId() == null)? Product.ID++ : product.getProductId();
	}
	
	public static StringProperty booleanToYesOrNoStringProperty(Product product)
	{
		if(product.productInStock().getValue()) return new SimpleStringProperty("Yes");
		return new SimpleStringProperty("No");
	}
}
