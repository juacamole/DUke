module com.example.duke {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.duke to javafx.fxml;
    exports com.example.duke;
}