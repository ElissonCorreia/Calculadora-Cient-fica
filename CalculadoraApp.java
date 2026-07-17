import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextFIeld;
import javafx.scene.layout.VBox; // Funcional para empilhar elementos verticalmente.
import javafx.stage.Stage; 

public class CalculadoraApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // 1. Criando o visor 
        TextField display = new TextField();
        display.setEditable(false); // O visor não deve ser editável pelo usuário.
        display.setPromptText("0.0"); // Texto inicial do visor.

        // 2. Criando o layout
        // VBox é um layout que organiza os elementos verticalmente.
        Vbox layout = new VBox();
        
        // 3. Adicionando o visor ao layout
        layout.getChildren().add(display); // 

        // 4. Criando a cena    
        Scene scene = new Scene(layout, 300, 400); // Largura: 300px, Altura: 400px

        // 5. Configurando o palco (Stage) 
        primaryStage.setTitle("Calculadora Científica"); // Título da janela
        primaryStage.setScene(scene); // Definindo a cena no palco
        primaryStage.show(); // Exibindo a janela   
}

public static void main(String[] args) {
        launch(args); // Inicia a aplicação JavaFX
    }
}
