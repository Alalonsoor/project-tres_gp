package gp;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import gp.exceptions.FullColumnException;
import gp.logic.*;

public class SelectModeController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Game game;
    @FXML
    private Button btnFicha;

    @FXML
    private Button btnFicha1;

    @FXML
    private Button btnFicha2;

    @FXML
    private Button btnFicha3;

    @FXML
    private Button btnFicha4;

    @FXML
    private Button btnFicha5;

    @FXML
    private Button btnFicha6;

    @FXML
    private GridPane gridPane;

    @FXML
    void switchToTableroNormal(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("TABLERO BÁSICO.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    private void colocarFicha(MouseEvent event) throws FullColumnException {
        //if (event.getSource() instanceof Button) {
            int columna = GridPane.getColumnIndex((Node)event.getSource());
            
            try {
                Parent ficha = FXMLLoader.load(getClass().getResource("FICHA JUGADOR 1.fxml"));
                int fila = game.place(columna);
                gridPane.add(ficha, columna, fila);
            } catch (IOException e) {
                e.printStackTrace();
            }
        //}
    }
    
    @FXML
    void switchToTablero5en(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("TABLERO 5 IN ROW.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void onMouseEntered(MouseEvent event) {
        // Código para el efecto al entrar con el mouse
        Node node = (Node) event.getSource();
        node.setStyle("-fx-background-color: lightgray;");
    }

    @FXML
    void onMouseExited(MouseEvent event) {
        // Código para revertir el efecto al salir con el mouse
        Node node = (Node) event.getSource();
        node.setStyle("-fx-background-color: transparent;");
    }
}