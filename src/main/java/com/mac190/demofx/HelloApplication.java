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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Create a parent container for eh application
        BorderPane root = new BorderPane();
        //create three buttons
        Button plusBtn = new Button("+");
        int width = 40;
        int height = 40;
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
       //equalBtn.setPrefWidth(2*width);
        //equalBtn.setPrefHeight(height);
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
        //buttonBox.getChildren().add(equalBtn);
        //create a label.
        Label resultLbl = new Label("Result: ");
        resultLbl.setFont(Font.font(16));
        Label num1Lbl = new Label("Num1: ");
        num1Lbl.setFont(Font.font(16));
        TextField num1Text = new TextField();
        HBox num1Box = new HBox();
        num1Box.setSpacing(5);
        num1Box.getChildren().addAll(num1Lbl, num1Text);
        num1Text.minWidth(30);
        num1Text.maxWidth(50);
        Label num2Lbl = new Label("Num2: ");
        TextField num2Text = new TextField();
        HBox num2Box = new HBox();
        num2Box.setSpacing(5);
        num2Box.getChildren().addAll(num2Lbl, num2Text);
        num2Text.minWidth(30);
        num2Text.maxWidth(50);
        num2Lbl.setFont(Font.font(16));
        VBox numBox = new VBox();
        numBox.setSpacing(10);
        numBox.setAlignment(Pos.TOP_LEFT);
        numBox.getChildren().addAll(num1Box, num2Box);
        VBox textBox = new VBox();
        textBox.setSpacing(70);
        textBox.getChildren().addAll(numBox, resultLbl);

        //setting the + button to do something when clicked
        plusBtn.setOnAction(e->{
            System.out.println("Num1: " + num1Text.getText());
            System.out.println("Num2: " + num2Text.getText());
            double num1 = Double.parseDouble(num1Text.getText());
            double num2 = Double.parseDouble(num2Text.getText());
            System.out.println("Result: " + (num1+num2));
            resultLbl.setText(resultLbl.getText() + (num1+num2));
        });


        //put the two previous VBoxes one next to another
        HBox finalBox = new HBox();
        finalBox.setSpacing(50);
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