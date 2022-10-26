module com.example.calcjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcjavafx to javafx.fxml;
    exports com.example.calcjavafx;
}