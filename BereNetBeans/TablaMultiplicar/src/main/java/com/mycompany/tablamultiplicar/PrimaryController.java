package com.mycompany.tablamultiplicar;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private ListView<String> listTabla;

    @FXML
    private void Calcular() {
        try {
            
            int n = Integer.parseInt(txtNumero.getText().trim());
            ObservableList<String> renglones = FXCollections.observableArrayList();
            for (int i = 1; i <= 10; i++) {
                renglones.add(n + " x " + i + " = " + (n * i));
            }
            listTabla.setItems(renglones);

        } catch (NumberFormatException e) {
        }
    }

    @FXML
    private void Limpiar() {
        txtNumero.clear();
        listTabla.getItems().clear();
    }
}
