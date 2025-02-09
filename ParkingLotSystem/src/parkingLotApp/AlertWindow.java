package parkingLotApp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
*   This class is used for pop-up alert windows.
*
*   @author dimonti90 <A HREF="mailto:dimonti90@yahoo.com"> (dimonti90@yahoo.com) </A>
*
*   @version December 16, 2017
*
*   **/
public class AlertWindow implements Initializable{

	static boolean isVehicleDeleted;

	public static void displayCancelAlertBox(String alertTitle, String alertMessage){
		Stage alertWindow = new Stage();
		alertWindow.initModality(Modality.APPLICATION_MODAL); //blocks input events until alert window is closed
		alertWindow.setTitle(alertTitle);
		alertWindow.setMaxWidth(350);
		alertWindow.setMaxHeight(150);
		alertWindow.setWidth(350);
		alertWindow.setHeight(150);

		Label alertMessageLabel = new Label();
		alertMessageLabel.setText(alertMessage);

		Button continueBtn = new Button("Continue");
		continueBtn.setPrefWidth(80);
		continueBtn.setPrefHeight(20);

		Button cancelBtn = new Button("Cancel");
		cancelBtn.setPrefWidth(80);
		cancelBtn.setPrefHeight(20);

		VBox layout = new VBox(10);
		layout.getChildren().addAll(alertMessageLabel, continueBtn, cancelBtn);
		layout.setAlignment(Pos.CENTER);

		cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
	   		@Override
	    	public void handle(ActionEvent e) {
	   		isVehicleDeleted = false;
	   		alertWindow.close();
	    	}
	    });

		continueBtn.setOnAction(new EventHandler<ActionEvent>() {
	   		@Override
	    	public void handle(ActionEvent e) {
	   		isVehicleDeleted = true;
	   		alertWindow.close();
	    	}
	    });

		Scene scene = new Scene(layout);
		alertWindow.setScene(scene);
		alertWindow.showAndWait();
	}


	public static void displayInputAlertBox(String alertTitle, String alertMessage){
		Stage alertWindow = new Stage();
		alertWindow.initModality(Modality.APPLICATION_MODAL); //blocks input events until alert window is closed
		alertWindow.setTitle(alertTitle);
		alertWindow.setMaxWidth(350);
		alertWindow.setMaxHeight(150);
		alertWindow.setWidth(350);
		alertWindow.setHeight(150);

		Label alertMessageLabel = new Label();
		alertMessageLabel.setText(alertMessage);

		Button okBtn = new Button("Ok");
		okBtn.setPrefHeight(20);
		okBtn.setPrefWidth(80);

		VBox layout = new VBox(10);
		layout.getChildren().addAll(alertMessageLabel, okBtn);
		layout.setAlignment(Pos.CENTER);

		okBtn.setOnAction(new EventHandler<ActionEvent>() {
	   		@Override
	    	public void handle(ActionEvent e) {
	   		alertWindow.close();
	    	}
	    });

		Scene scene = new Scene(layout);
		alertWindow.setScene(scene);
		alertWindow.showAndWait();
	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		isVehicleDeleted = false; // set default to false
	}


}
