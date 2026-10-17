package com.mycompany.enteros;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private ListView<String> listDivisores;

    @FXML
    private void Analizar() {
        try {
            String texto = txtNumero.getText().trim();
            int numero = Integer.parseInt(texto);

            int sumaImpares = 0;
            int sumaPares = 0;
            int mayor = -1;
            int menor = 10;

            
            for (int i = 0; i < texto.length(); i++) {
                int digito = Character.getNumericValue(texto.charAt(i));

                if (digito % 2 == 0) {
                    sumaPares += digito;
                } else {
                    sumaImpares += digito;
                }

                if (digito > mayor) mayor = digito;
                if (digito < menor) menor = digito;
            }

            int cantidadCifras = texto.length();
            int sumaTotal = sumaPares + sumaImpares;

            txtCantCifras.setText(String.valueOf(cantidadCifras));
            txtSumaImpares.setText(String.valueOf(sumaImpares));
            txtSumaPares.setText(String.valueOf(sumaPares));
            txtSumaTotal.setText(String.valueOf(sumaTotal));
            txtCifraMayor.setText(String.valueOf(mayor));
            txtCifraMenor.setText(String.valueOf(menor));

           
            ObservableList<String> divisores = FXCollections.observableArrayList();
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores.add(String.valueOf(i));
                }
            }
            listDivisores.setItems(divisores);

        } catch (NumberFormatException e) {
            
        }
    }

    @FXML
    private void Limpiar() {
        txtNumero.clear();
        txtCantCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        listDivisores.getItems().clear();
    }
}