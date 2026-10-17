module com.mycompany.enteros {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.enteros to javafx.fxml;
    exports com.mycompany.enteros;
}
