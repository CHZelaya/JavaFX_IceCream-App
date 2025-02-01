package org.example.javafx_icecreamapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class IceCreamShopController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}