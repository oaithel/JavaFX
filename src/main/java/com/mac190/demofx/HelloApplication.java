package com.mac190.demofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
        equalBtn.setPrefWidth(2*width);
        equalBtn.setPrefHeight(height);
        //Create a Vbo to add the 4 first buttons in a vertical way
        VBox buttonBox = new VBox();
        //Specify alignment
        buttonBox.setAlignment(Pos.TOP_RIGHT);
        //set vertical spacing in the box
        buttonBox.setSpacing(5);
        //add the four buttons to the box
        //To add an item to the box, get the list of its children and add
        //it to the list
        buttonBox.getChildren().addAll(plusBtn, minusBtn, multiplyBtn, divideBtn);
        buttonBox.getChildren().add(equalBtn);
        //create a label.
        Label resultLbl = new Label("Result: ");
        Label num1Lbl = new Label("Num1: ");
        TextField num1Text = new TextField();
        Label num2Lbl = new Label("Num2: ");
        TextField num2Text = new TextField();
        VBox textBox = new VBox();
        textBox.getChildren().addAll(num1Lbl, num1Text, num2Lbl, num2Text, resultLbl);
        //put the two previous VBoxes one next to another
        HBox finalBox = new HBox();
        finalBox.getChildren().addAll(textBox, buttonBox);
        root.setCenter(finalBox);
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