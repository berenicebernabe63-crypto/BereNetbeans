package com.mycompany.mavenproject1;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFechaNac;

    @FXML
    private Label lblResultado;

    @FXML
    private void handleCalcular() {
        try {
            String textoFecha = txtFechaNac.getText().trim();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNac = LocalDate.parse(textoFecha, formatter);
            LocalDate fechaActual = LocalDate.now();

            Period periodo = Period.between(fechaNac, fechaActual);
            int años = periodo.getYears();
            int meses = periodo.getMonths();

            lblResultado.setText("Tiene " + años + " años con " + meses + " meses");
        } catch (Exception e) {
            lblResultado.setText("Formato incorrecto (use dd/mm/yyyy)");
        }
    }

    @FXML
    private void handleLimpiar() {
        txtFechaNac.clear();
        lblResultado.setText("Tiene 0 años con 0 meses");
    }
}
