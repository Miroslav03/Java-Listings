module com.example.chapter15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chapter15 to javafx.fxml;
    exports com.example.chapter15;
}