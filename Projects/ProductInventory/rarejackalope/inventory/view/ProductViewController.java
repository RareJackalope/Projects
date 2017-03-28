package rarejackalope.inventory.view;

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
	@FXML private Label pricePerUnit;
	@FXML private Label productId;
	@FXML private Label unitsAvaliable;
	@FXML private Label currentStockValue;
	
	private Main main;
	
	@FXML
	public void initialize()
	{
		
	}
}
