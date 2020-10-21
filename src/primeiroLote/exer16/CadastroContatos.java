package primeiroLote.exer16;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CadastroContatos extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		HBox painel = new HBox();
		

		Scene cena = new Scene(painel, 600, 150);
		
		VBox vbEs = new VBox();
		vbEs.setPadding(new Insets(15, 12, 15, 12));
		vbEs.setSpacing(15);
		
		VBox vbDi = new VBox();
		vbDi.setPadding(new Insets(15, 12, 15, 12));
		vbDi.setSpacing(5);
						
		HBox hbBotao = new HBox();
		hbBotao.setSpacing(5);

		Button btSalvar = new Button("Salvar");
		Button btPesquisar = new Button("Pesquisar");

		hbBotao.getChildren().add(btSalvar);
		hbBotao.getChildren().add(btPesquisar);
		
		vbEs.getChildren().add(new Label("Id:"));
		vbEs.getChildren().add(new Label("Nome:"));
		vbEs.getChildren().add(new Label("Telefone:"));
		vbEs.getChildren().add(hbBotao);
		
		TextField tfId = new TextField();
		tfId.setPrefWidth(400);
		TextField tfNome = new TextField();
		TextField tfTelefone = new TextField();
		
		vbDi.getChildren().add(tfId);
		vbDi.getChildren().add(tfNome);
		vbDi.getChildren().add(tfTelefone);
		
		
		painel.getChildren().add(vbEs);
		painel.getChildren().add(vbDi);

		primaryStage.setTitle("Cadastro Contato");
		primaryStage.setScene(cena);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	public static void main(String[] args) {

		Application.launch(CadastroContatos.class, args);
	}

}
