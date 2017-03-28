package rarejackalope.inventory.view;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import rarejackalope.inventory.Main;
import rarejackalope.inventory.model.Product;

public class ProductViewController 
{
	@FXML private TableView<Product> productTable;
	@FXML private TableColumn<Product, String> productNameColumn;
	@FXML private TableColumn<Product, Boolean> productAvaliabilityColumn;
	@FXML private Label productNameLabel;
	@FXML private Label pricePerUnitLabel;
	@FXML private Label productIdLabel;
	@FXML private Label unitsAvaliableLabel;
	@FXML private Label currentStockValueLabel;
	
	private Main main;
	
	@FXML
	public void initialize()
	{
		productNameColumn.setCellValueFactory(cellData -> cellData.getValue().productName());
		productAvaliabilityColumn.setCellValueFactory(cellData -> cellData.getValue().productInStock().asObject());
		
		showProductDetails(null);
		
		productTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showProductDetails(newValue));
		
	}

	private void showProductDetails(Product product) 
	{
		if(product != null)
		{
			productNameLabel.setText(product.getProductName());
			pricePerUnitLabel.setText(Double.toString(product.getPricePerProduct()));
			productIdLabel.setText(Integer.toString(product.getProductId()));
			unitsAvaliableLabel.setText(Integer.toString(product.getProductStockAmount()));
			currentStockValueLabel.setText(totalProductValue(product.getPricePerProduct(), product.getProductStockAmount()));
		}
		else
		{
			productNameLabel.setText("");
			pricePerUnitLabel.setText("");
			productIdLabel.setText("");
			unitsAvaliableLabel.setText("");
			unitsAvaliableLabel.setText("");
			currentStockValueLabel.setText("");
		}
	}

	private String totalProductValue(double pricePerProduct, int productStockAmount) 
	{	
		NumberFormat formatter = new DecimalFormat("#0.00");
		return formatter.format(pricePerProduct * productStockAmount);
	}
	
	public void setMain(Main main)
	{
		this.main = main;
		productTable.setItems(main.getProductData());
	}
}
