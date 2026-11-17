package com.mac190.demofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class MainCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //create a Calculator object
        Calculator cal = new Calculator();
        //Create a parent container for eh application
        BorderPane root = cal.getRoot();
        //create a Scene
        Scene scene = new Scene(root, 330, 300);
        stage.setTitle("DemoFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}