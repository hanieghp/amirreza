module com.example.amirreza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.amirreza to javafx.fxml;
    exports com.example.amirreza;
}