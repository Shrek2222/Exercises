package ui;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class WelcomePanel extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btnOk = new Button("WOKAY");
		Scene scene = new Scene(btnOk, 200, 200);
		primaryStage.setTitle("Welcome Babu");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
		Stage stooge = new Stage();
		stooge.setTitle("Bye Bye");
		stooge.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
