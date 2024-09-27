package org.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

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

    @FXML
    void calculo(ActionEvent event) {
        double n2, n1, resultado;
        try {
            n2 = Double.parseDouble(o2.getText());
            n1 = Double.parseDouble(o1.getText());
        } catch (NumberFormatException e) {
            System.out.println("No es un numero");
            return;
        }
        if (sumar.isSelected()) {
            resultado=n1+n2;
            res.setText(""+resultado);
        } else if (restar.isSelected()) {
            resultado=n1-n2;
            res.setText(""+(n1-n2));
        } else if (multiplicar.isSelected()) {
            resultado=n1*n2;
            res.setText(""+(n1*n2));
        } else if (dividir.isSelected()) {
            resultado=n1/n2;
             if(n2==0) {
                System.out.println("Divisor 0 localizado");
                o2.setText("");
             } else {
                 res.setText(""+(n1/n2));
             }
        }
    }


}
