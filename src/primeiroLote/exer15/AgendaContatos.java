package primeiroLote.exer15;



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AgendaContatos extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane painel = new GridPane();

		Scene cena = new Scene(painel, 600, 200);

		painel.add(new Label("Entre com o numero do telefone:"), 0, 0);
		painel.add(new Label("Entre com o seu nome:"), 0, 1);

		TextField tfTelefone = new TextField();
		TextField tfNome = new TextField();

		painel.add(tfTelefone, 1, 0);
		painel.add(tfNome, 1, 1);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(40);

		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(60);

		painel.getColumnConstraints().addAll(col1, col2);

		HBox hb = new HBox();
		hb.setPadding(new Insets(15, 12, 15, 12));
		hb.setSpacing(10);

		Button btOk = new Button("Ok");
		Button btCancelar = new Button("Cancelar");

		hb.getChildren().add(btOk);
		hb.getChildren().add(btCancelar);

		painel.add(hb, 0, 3);

		primaryStage.setTitle("Agenda de contatos");
		primaryStage.setScene(cena);
		primaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(AgendaContatos.class, args);
	}

}
