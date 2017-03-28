package rarejackalope.inventory.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import rarejackalope.inventory.ProductUtil;

public class Product 
{
	private final StringProperty productName;
	private final DoubleProperty pricePerProduct;
	private IntegerProperty productStockAmount;
	private final IntegerProperty productId;
	private BooleanProperty productInStock;
	public static int ID = 0;
	
	private Product(StringProperty productName, DoubleProperty pricePerProduct, IntegerProperty productStockAmount,
			IntegerProperty productId) 
	{
		super();
		this.productName = productName;
		this.pricePerProduct = pricePerProduct;
		this.productStockAmount = productStockAmount;
		this.productId = productId;
		this.productInStock = new SimpleBooleanProperty(ProductUtil.isProductInStock(this));
	}
	
	public Product(String productName, Double pricePerProduct, Integer productStockAmount)
	{
		this.productName = new SimpleStringProperty(productName);
		this.pricePerProduct = new SimpleDoubleProperty(pricePerProduct);
		this.productStockAmount = new SimpleIntegerProperty(productStockAmount);
		this.productId = new SimpleIntegerProperty(ProductUtil.getId(this));
		this.productInStock = new SimpleBooleanProperty(ProductUtil.isProductInStock(this));
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
