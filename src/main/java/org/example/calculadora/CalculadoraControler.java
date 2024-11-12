package org.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/**
 * Controlador para la interfaz de la calculadora, que gestiona los eventos y operaciones
 * aritméticas seleccionadas por el usuario.
 */
public class CalculadoraControler {

    @FXML
    private Button calcular;

    @FXML
    private RadioButton dividir;

    @FXML
    private RadioButton multiplicar;

    @FXML
    private TextField o1;

    @FXML
    private TextField o2;

    @FXML
    private ToggleGroup operacion;

    @FXML
    private TextField res;

    @FXML
    private RadioButton restar;

    @FXML
    private RadioButton sumar;

    /**
     * Realiza el cálculo de la operación aritmética seleccionada por el usuario.
     * Este metodo se activa cuando el usuario hace clic en el botón "calcular".
     *
     * @param event El evento que dispara el cálculo, típicamente un clic en el botón "calcular".
     */
    @FXML
    void calculo(ActionEvent event) {
        double n2 = 0, n1 = 0, resultado;
        try {
            n2 = Double.parseDouble(o2.getText());
            n1 = Double.parseDouble(o1.getText());
        } catch (NumberFormatException e) {
            if (o2.getText().equals("") || o1.getText().equals("")) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(null);
                alerta.setTitle("Error");
                alerta.setContentText("Espacio en blanco, escriba un número en ambos operadores");
                alerta.showAndWait();
            } else {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(null);
                alerta.setTitle("Error");
                alerta.setContentText("No es un número válido");
                alerta.showAndWait();
            }
        }

        if (sumar.isSelected()) {
            resultado = n1 + n2;
            res.setText("" + resultado);
        } else if (restar.isSelected()) {
            resultado = n1 - n2;
            res.setText("" + resultado);
        } else if (multiplicar.isSelected()) {
            resultado = n1 * n2;
            res.setText("" + resultado);
        } else if (dividir.isSelected()) {
            resultado = n1 / n2;
            if (n2 == 0) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setHeaderText(null);
                alerta.setTitle("Error");
                alerta.setContentText("Divisor 0 localizado.");
                alerta.showAndWait();
                o2.setText("");
            } else {
                res.setText("" + resultado);
            }
        }
    }
}
