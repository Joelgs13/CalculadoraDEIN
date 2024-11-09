package org.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculadoraApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraApp.class.getResource("CalculadoraControler.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 340);
        stage.setTitle("CalculadoraDejoel");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}