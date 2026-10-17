module com.mycompany.gastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gastossemanales to javafx.fxml;
    exports com.mycompany.gastossemanales;
}
