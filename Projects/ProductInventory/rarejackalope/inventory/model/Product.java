package rarejackalope.inventory.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product 
{
	private final StringProperty productName;
	private final DoubleProperty pricePerProduct;
	private final IntegerProperty productStockAmount;
	private final IntegerProperty productId;
	private final BooleanProperty productInStock;
	
	public Product(StringProperty productName, DoubleProperty pricePerProduct, IntegerProperty productStockAmount,
			IntegerProperty productId, BooleanProperty productInStock) 
	{
		super();
		this.productName = productName;
		this.pricePerProduct = pricePerProduct;
		this.productStockAmount = productStockAmount;
		this.productId = productId;
		this.productInStock = productInStock;
	}
	
	public Product(String productName, Double pricePerProduct, Integer productStockAmount)
	{
		this.productName = new SimpleStringProperty(productName);
		this.pricePerProduct = new SimpleDoubleProperty(pricePerProduct);
		//Dummy data.
		this.productStockAmount = new SimpleIntegerProperty(1);
		this.productId = new SimpleIntegerProperty(12345);
		this.productInStock = new SimpleBooleanProperty(true);
	}
	
	public Product()
	{
		this(null,null,null);
	}

	public String getProductName() 
	{
		return productName.get();
	}
	
	public StringProperty productName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName.set(productName);
	}
	
	public double getPricePerProduct() 
	{
		return pricePerProduct.get();
	}
	
	public void setPricePerProduct(Double pricePerProduct)
	{
		this.pricePerProduct.set(pricePerProduct);
	}
	
	public DoubleProperty pricePerProduct()
	{
		return pricePerProduct;
	}

	public int getProductStockAmount() 
	{
		return productStockAmount.get();
	}
	
	public IntegerProperty productStockAmount()
	{
		return productStockAmount;
	}
	
	public void setProductStockAmount(int productStockAmount)
	{
		this.productStockAmount.set(productStockAmount);
	}

	public int getProductId() 
	{
		return productId.get();
	}
	
	public IntegerProperty productId()
	{
		return productId;
	}
	
	public void setId(int id)
	{
		this.productId.set(id);
		
	}

	public boolean getProductInStock() 
	{
		return productInStock.get();
	}
	
	public BooleanProperty productInStock()
	{
		return productInStock;
	}
	
	public void setProductInStock(boolean productInStock)
	{
		this.productInStock.set(productInStock);
	}
}
