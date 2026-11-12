package com.mac190.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Create a parent container for eh application
        BorderPane root = new BorderPane();
        //create three buttons
        Button plusBtn = new Button("+");
        int width = 50;
        int height = 50;
        plusBtn.setPrefWidth(width);
        plusBtn.setPrefHeight(height);
        Button minusBtn = new Button("-");
        minusBtn.setPrefWidth(width);
        minusBtn.setPrefHeight(height);
        Button multiplyBtn = new Button("*");
        multiplyBtn.setPrefWidth(width);
        multiplyBtn.setPrefHeight(height);
        Button divideBtn = new Button("/");
        divideBtn.setPrefWidth(width);
        divideBtn.setPrefHeight(height);
        Button equalBtn = new Button("=");
        //Create a Vbo to add the 4 first buttons in a vertical way
        VBox buttonBox = new VBox();
        //add the four buttons to the box
        //To add an item to the box, get the list of its children and add
        //it to the list
        buttonBox.getChildren().addAll(plusBtn, minusBtn, multiplyBtn, divideBtn);
        root.setCenter(buttonBox);
        //create a Scene
        Scene scene = new Scene(root, 330, 500);
        stage.setTitle("DemoFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}