module com.example.chapter13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter13 to javafx.fxml;
    exports com.example.chapter13;
}