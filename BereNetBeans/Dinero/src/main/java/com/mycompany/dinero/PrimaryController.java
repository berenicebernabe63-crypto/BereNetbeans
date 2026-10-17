package com.mycompany.dinero;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtDinero;
    @FXML private Label lbl500, lbl200, lbl100, lbl50, lbl20, lbl10, lbl5, lbl2, lbl1;

    @FXML
    private void Desglosar() {
        try {
            int cantidad = Integer.parseInt(txtDinero.getText().trim());

            int b500 = cantidad / 500;
            cantidad %= 500;
            
            int b200 = cantidad / 200;
            cantidad %= 200;
            
            int b100 = cantidad / 100;
            cantidad %= 100;
            
            int b50 = cantidad / 50;
            cantidad %= 50;
            
            int b20 = cantidad / 20;
            cantidad %= 20;
            
            int m10 = cantidad / 10;
            cantidad %= 10;
            
            int m5 = cantidad / 5;
            cantidad %= 5;
            
            int m2 = cantidad / 2;
            cantidad %= 2;
            
            int m1 = cantidad;

            lbl500.setText(String.valueOf(b500));
            lbl200.setText(String.valueOf(b200));
            lbl100.setText(String.valueOf(b100));
            lbl50.setText(String.valueOf(b50));
            lbl20.setText(String.valueOf(b20));
            lbl10.setText(String.valueOf(m10));
            lbl5.setText(String.valueOf(m5));
            lbl2.setText(String.valueOf(m2));
            lbl1.setText(String.valueOf(m1));

        } catch (NumberFormatException e) {
        
        }
    }

    @FXML
    private void Borrar() {
        txtDinero.clear();
        lbl500.setText("0");
        lbl200.setText("0");
        lbl100.setText("0");
        lbl50.setText("0");
        lbl20.setText("0");
        lbl10.setText("0");
        lbl5.setText("0");
        lbl2.setText("0");
        lbl1.setText("0");
    }
}