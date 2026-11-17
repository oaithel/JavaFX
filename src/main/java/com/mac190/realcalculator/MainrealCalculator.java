package com.mac190.realcalculator;

import com.mac190.demofx.Calculator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainrealCalculator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //create a Calculator object
        RealCalculator cal = new RealCalculator();
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
