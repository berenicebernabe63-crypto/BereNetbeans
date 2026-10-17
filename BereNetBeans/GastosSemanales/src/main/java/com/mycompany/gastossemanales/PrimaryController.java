package com.mycompany.gastossemanales;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;

    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoAlto;

    @FXML
    private void Calcular() {
        try {
            // Leemos los 5 valores ingresados
            double alimentacion = Double.parseDouble(txtAlimentacion.getText().trim());
            double refrigerios = Double.parseDouble(txtRefrigerios.getText().trim());
            double transporte = Double.parseDouble(txtTransporte.getText().trim());
            double telefonia = Double.parseDouble(txtTelefonia.getText().trim());
            double otros = Double.parseDouble(txtOtros.getText().trim());

           
            double total = alimentacion + refrigerios + transporte + telefonia + otros;
            txtTotal.setText(String.valueOf((int) total));
            double max = alimentacion;
            String categoriaMax = "Alimentación";

            if (refrigerios > max) {
                max = refrigerios;
                categoriaMax = "Refrigerios";
            }
            if (transporte > max) {
                max = transporte;
                categoriaMax = "Transporte";
            }
            if (telefonia > max) {
                max = telefonia;
                categoriaMax = "Telefonía";
            }
            if (otros > max) {
                max = otros;
                categoriaMax = "Otros";
            }

            
            txtGastoAlto.setText(categoriaMax);

        } catch (NumberFormatException e) {
            
        }
    }

    @FXML
    private void Limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
    }
}