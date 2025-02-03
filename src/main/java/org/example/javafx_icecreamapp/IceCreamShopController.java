package org.example.javafx_icecreamapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class IceCreamShopController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnCheckOut;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnNewOrder;

    @FXML
    private CheckBox checkBoxCandy;

    @FXML
    private CheckBox checkBoxCaramel;

    @FXML
    private CheckBox checkBoxChocolate;

    @FXML
    private CheckBox checkBoxEspresso;

    @FXML
    private CheckBox checkBoxFruit;

    @FXML
    private CheckBox checkBoxMatcha;

    @FXML
    private CheckBox checkBoxMint;

    @FXML
    private CheckBox checkBoxNuts;

    @FXML
    private CheckBox checkBoxPistachio;

    @FXML
    private CheckBox checkBoxSprinkles;

    @FXML
    private CheckBox checkBoxStrawberry;

    @FXML
    private CheckBox checkBoxVanilla;

    @FXML
    private CheckBox checkBoxWaffle;

    @FXML
    private HBox hBoxExtras;

    @FXML
    private ListView<?> listViewOrderSummary;

    @FXML
    private RadioButton radioBtnDouble;

    @FXML
    private RadioButton radioBtnKids;

    @FXML
    private RadioButton radioBtnSingle;

    @FXML
    private RadioButton radioBtnTriple;

    @FXML
    private ToggleGroup scoopGroup;

    @FXML
    private TextField textFieldTotalPrice;

    @FXML
    private VBox vBoxScoopChoice;

    @FXML
    private VBox vboxExtrasChoiceA;

    @FXML
    private VBox vboxExtrasChoiceB;

    @FXML
    private VBox vboxFlavorChoiceA;

    @FXML
    private VBox vboxFlavorChoiceB;

    @FXML
    void initialize() {
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnCheckOut != null : "fx:id=\"btnCheckOut\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnNewOrder != null : "fx:id=\"btnNewOrder\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxCandy != null : "fx:id=\"checkBoxCandy\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxCaramel != null : "fx:id=\"checkBoxCaramel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxChocolate != null : "fx:id=\"checkBoxChocolate\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxEspresso != null : "fx:id=\"checkBoxEspresso\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxFruit != null : "fx:id=\"checkBoxFruit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxMatcha != null : "fx:id=\"checkBoxMatcha\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxMint != null : "fx:id=\"checkBoxMint\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxNuts != null : "fx:id=\"checkBoxNuts\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxPistachio != null : "fx:id=\"checkBoxPistachio\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxSprinkles != null : "fx:id=\"checkBoxSprinkles\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxStrawberry != null : "fx:id=\"checkBoxStrawberry\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxVanilla != null : "fx:id=\"checkBoxVanilla\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxWaffle != null : "fx:id=\"checkBoxWaffle\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert hBoxExtras != null : "fx:id=\"hBoxExtras\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert listViewOrderSummary != null : "fx:id=\"listViewOrderSummary\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnDouble != null : "fx:id=\"radioBtnDouble\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnKids != null : "fx:id=\"radioBtnKids\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnSingle != null : "fx:id=\"radioBtnSingle\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnTriple != null : "fx:id=\"radioBtnTriple\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert scoopGroup != null : "fx:id=\"scoopGroup\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFieldTotalPrice != null : "fx:id=\"textFieldTotalPrice\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vBoxScoopChoice != null : "fx:id=\"vBoxScoopChoice\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxExtrasChoiceA != null : "fx:id=\"vboxExtrasChoiceA\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxExtrasChoiceB != null : "fx:id=\"vboxExtrasChoiceB\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxFlavorChoiceA != null : "fx:id=\"vboxFlavorChoiceA\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxFlavorChoiceB != null : "fx:id=\"vboxFlavorChoiceB\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
