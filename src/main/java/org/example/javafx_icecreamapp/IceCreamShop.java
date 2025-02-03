package org.example.javafx_icecreamapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class IceCreamShop extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(IceCreamShop.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        stage.setTitle("Ice Cream Shop!");
        stage.setScene(scene);

        // Set fixed dimensions
        stage.setMinWidth(900);
        stage.setMaxWidth(900);
        stage.setMinHeight(600);
        stage.setMaxHeight(600);

        // Disable resizing
        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}