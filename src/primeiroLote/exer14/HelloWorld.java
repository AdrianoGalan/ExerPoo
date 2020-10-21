package primeiroLote.exer14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane painel = new Pane();
		
		Scene cena = new Scene(painel, 600,200);
		
		painel.getChildren().add(new Label("ola mundo"));
		
		
		primaryStage.setTitle("Ola mundo");
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		Application.launch(HelloWorld.class, args);
		
	}

}
