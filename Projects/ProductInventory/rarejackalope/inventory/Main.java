package rarejackalope.inventory;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/*
 *Brief
 *Product Inventory Project - Create an application which manages an inventory of products. 
 *Create a product class which has a price, id, and quantity on hand. 
 *Then create an inventory class which keeps track of various products and can sum up the inventory value. 
 * 
 */
public class Main extends Application
{
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Inventory Management Demo");
		
		initialiseRootLayout();
		showInventoryView();
	}
	
	
	private void showInventoryView() 
	{
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/ProductView.fxml"));
			AnchorPane pane = (AnchorPane) loader.load();
			
			rootLayout.setCenter(pane);
			
		}catch(IOException exc)
		{
			exc.printStackTrace();
		}
	}

	private void initialiseRootLayout() 
	{
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane)loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(IOException exc)
		{
			exc.printStackTrace();
		}
	}

}
