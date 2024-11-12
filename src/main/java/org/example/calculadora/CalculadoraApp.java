package org.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación Calculadora.
 * Extiende de {@link Application} y es el punto de entrada para lanzar la aplicación JavaFX.
 */
public class CalculadoraApp extends Application {

    /**
     * Metodo sobrescrito de la clase {@link Application} que inicializa y muestra la ventana principal de la aplicación.
     *
     * @param stage El escenario principal de JavaFX proporcionado por el sistema al lanzar la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraApp.class.getResource("CalculadoraControler.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 340);
        stage.setTitle("CalculadoraDejoel");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * Metodo principal de la aplicación. Llama a {@link Application#launch(String...)} para iniciar la aplicación JavaFX.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
