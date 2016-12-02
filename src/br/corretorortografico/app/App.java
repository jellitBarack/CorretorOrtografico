package br.corretorortografico.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/br/corretorortografico/views/VBoxPrincipal.fxml"));
	
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.setTitle("Corretor Ortografico");
		stage.show();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
