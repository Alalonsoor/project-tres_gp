package gp;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SelectModeController {
	private Stage stage;
	private Scene scene;
	private Parent root;

    @FXML
    private Button btn5en;

    @FXML
    private Button btnClasico;

    @FXML
    private Button btnSuper;

    @FXML
    private Button btnpop;
    
    @FXML
    void switchToTableroNormal(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/clasico/TABLERO CLASSIC.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToTableroNormalOnline(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/clasico/TABLERO CLASSIC ONLINE.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    @FXML
    void switchToTableroFacil(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/clasico/TABLERO CLASSIC FACIL.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToTableroMedio(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/clasico/TABLERO CLASSIC MEDIO.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    @FXML
    void switchToTableroDificil(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/clasico/TABLERO CLASSIC DIFICIL.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToSceneJugvsIA(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Jugador vs IA.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToSceneDifIA(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Dif IA.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToSceneLocOMult(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("1 VS 1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    @FXML
    void onMouseEntered(MouseEvent event) {
        // Código para el efecto al entrar con el mouse
        Button button = (Button) event.getSource();
        button.setOpacity(0.35); // Cambiar la opacidad para simular una luz encendida
    }

    @FXML
    void onMouseExited(MouseEvent event) {
        // Código para revertir el efecto al salir con el mouse
        Button button = (Button) event.getSource();
        button.setOpacity(0.0); // Restaurar la opacidad original para apagar la "luz"
    }
    @FXML
    void switchToTablero5en(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/cincoenRaya/TABLERO 5 IN ROW.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    } 
    @FXML
    void switchToTableroSuperFichas(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/superfichas/TABLERO SUPERFICHAS SELECCION.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    @FXML
    void switchToTableroPopOut(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/gp/popOut/TABLERO POP-OUT.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToScene2(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("SEGUNDA PORTADA.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    void switchToNewContinue(MouseEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("nueva-continuar partida.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
}
