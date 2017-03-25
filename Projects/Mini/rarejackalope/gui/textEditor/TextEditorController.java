package rarejackalope.gui.textEditor;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextEditorController {

	@FXML
	private TextArea areaText;
	private TextEditorModel model;
	
	public TextEditorController(TextEditorModel model) 
	{
		this.model = model;
	}
	
	@FXML
	private void onSave()
	{
		
	}
	
	@FXML
	private void onLoad()
	{
		
	}
	
	@FXML
	private void onAbout()
	{
		
	}
	
	@FXML
	private void onClose()
	{
		System.exit(0);
	}
	
	
}
