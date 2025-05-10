module com.example.cahpter8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cahpter8 to javafx.fxml;
    exports com.example.cahpter8;
}