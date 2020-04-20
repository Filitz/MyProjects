package filizola;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

	@FXML private Button btnNew;
	@FXML private Button btnEdit;

	// initialize
	@FXML private void initialize() {
		btnNew.setOnAction(e -> onNewClicked());
		btnEdit.setOnAction(e -> onEditClicked());
	}

	public void onNewClicked(){
		try {
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("NewEntry.fxml"));
			Scene scene = new Scene(root,700,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.show();
			secondStage.setTitle("New Entry");
			secondStage.setMinWidth(650); 	// min width of the stage
			secondStage.setMinHeight(500);	// min height of the stage
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void onEditClicked(){
		System.out.println("Edit");
	}

}
