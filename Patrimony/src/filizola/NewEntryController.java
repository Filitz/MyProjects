package filizola;


import java.util.Optional;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.control.Alert.AlertType;

public class NewEntryController {

		@FXML private DatePicker datePick;
		@FXML private TextField amountReal;
		@FXML private TextField cambioRatio;
		@FXML private TextField amountCad;
		@FXML private Button btnCancel;
		@FXML private Button btnCheck;
		@FXML private Button btnSave;


		// initialize
		@FXML private void initialize() {
			btnCancel.setOnAction(e -> onCancelClicked());
			btnCheck.setOnAction(e -> onCheckClicked());
			amountCad.setEditable(false);
			btnSave.setOnAction(e -> onSaveClicked());
		}

		public void onCancelClicked(){
			Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to cancel?");
			Optional<ButtonType> result = alert.showAndWait();
			if (result.isPresent() && result.get() == ButtonType.OK){
				Stage stage = (Stage) btnCancel.getScene().getWindow();
				stage.close();
			}
		}

		public void onCheckClicked(){
			double result = 0;
			result = Double.parseDouble(amountReal.getText()) / Double.parseDouble(cambioRatio.getText());
			amountCad.setText(result + "");
		}

		public void onSaveClicked(){

		}

}
