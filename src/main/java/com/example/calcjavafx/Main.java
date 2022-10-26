package com.example.calcjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
        stage.setTitle("Calculator");
        stage.setScene(new Scene(pane, 300 ,275));
        stage.show();
    }
}
