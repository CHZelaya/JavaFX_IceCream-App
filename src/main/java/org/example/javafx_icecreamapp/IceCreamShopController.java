package org.example.javafx_icecreamapp;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class IceCreamShopController implements Prices, Flavors {

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    private double total = 0.0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAdd;

    @FXML
    private TextField textFieldTotal;

    @FXML
    private Button btnCheckOut;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnNewOrder;

    @FXML
    private CheckBox checkBoxCandy;

    @FXML
    private CheckBox checkBoxFruit;

    @FXML
    private CheckBox checkBoxNuts;

    @FXML
    private CheckBox checkBoxSprinkles;

    @FXML
    private CheckBox checkBoxWaffle;

    @FXML
    private HBox hBoxExtras;

    @FXML
    private ListView<Object> listViewOrderSummary;

    @FXML
    private RadioButton radioBtnDouble;

    @FXML
    private RadioButton radioBtnKids;

    @FXML
    private RadioButton radioBtnSingle;

    @FXML
    private RadioButton radioBtnTriple;

    @FXML
    private ComboBox<String> scoopBox1;

    @FXML
    private ComboBox<String> scoopBox2;

    @FXML
    private ComboBox<String> scoopBox3;

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
    private VBox vboxFlavorChoiceB;



    @FXML
    void initialize() {
        assert btnAdd != null : "fx:id=\"btnAdd\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnCheckOut != null : "fx:id=\"btnCheckOut\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnExit != null : "fx:id=\"btnExit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert btnNewOrder != null : "fx:id=\"btnNewOrder\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxCandy != null : "fx:id=\"checkBoxCandy\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxFruit != null : "fx:id=\"checkBoxFruit\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxNuts != null : "fx:id=\"checkBoxNuts\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxSprinkles != null : "fx:id=\"checkBoxSprinkles\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert checkBoxWaffle != null : "fx:id=\"checkBoxWaffle\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert hBoxExtras != null : "fx:id=\"hBoxExtras\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert listViewOrderSummary != null : "fx:id=\"listViewOrderSummary\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnDouble != null : "fx:id=\"radioBtnDouble\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnKids != null : "fx:id=\"radioBtnKids\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnSingle != null : "fx:id=\"radioBtnSingle\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert radioBtnTriple != null : "fx:id=\"radioBtnTriple\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert scoopBox1 != null : "fx:id=\"scoopBox1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert scoopBox2 != null : "fx:id=\"scoopBox2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert scoopBox3 != null : "fx:id=\"scoopBox3\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert scoopGroup != null : "fx:id=\"scoopGroup\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert textFieldTotalPrice != null : "fx:id=\"textFieldTotalPrice\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vBoxScoopChoice != null : "fx:id=\"vBoxScoopChoice\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxExtrasChoiceA != null : "fx:id=\"vboxExtrasChoiceA\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxExtrasChoiceB != null : "fx:id=\"vboxExtrasChoiceB\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert vboxFlavorChoiceB != null : "fx:id=\"vboxFlavorChoiceB\" was not injected: check your FXML file 'hello-view.fxml'.";

        //Grabbing my flavors
        ObservableList<String> flavors = FXCollections.observableArrayList(
                Flavors.CARAMEL,
                Flavors.CHOCOLATE,
                Flavors.COFFEE,
                Flavors.MATCHA,
                Flavors.MINT,
                Flavors.PISTACHIO,
                Flavors.VANILLA,
                Flavors.STRAWBERRY
        );

        // Setting combo boxes
        scoopBox1.setItems(flavors);
        scoopBox2.setItems(flavors);
        scoopBox3.setItems(flavors);

        setOnLoadDefaults();
    }



    private void setOnLoadDefaults() {
        scoopGroup.selectToggle(radioBtnSingle);
        scoopBox1.setValue(Flavors.VANILLA);
        scoopBox2.setDisable(true);
        scoopBox2.setValue(null);
        scoopBox3.setDisable(true);
        scoopBox3.setValue(null);
    }

    @FXML
    int checkActiveExtras() {
        int extrasChoice = 0;
        if (checkBoxCandy.isSelected()) {
            extrasChoice++;
        }
        if (checkBoxFruit.isSelected()) {
            extrasChoice++;
        }
        if (checkBoxNuts.isSelected()) {
            extrasChoice++;
        }
        if (checkBoxSprinkles.isSelected()) {
            extrasChoice++;
        }
        return extrasChoice;
    }

    @FXML
    void onAddButtonClicked(ActionEvent event) {
        String orderString = "";
        orderString = buildListViewString();
        listViewOrderSummary.getItems().clear();
        listViewOrderSummary.getItems().add(orderString);
        btnCheckOut.setDisable(false);
    }

    private String buildListViewString() {

        //Format prices into currency
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String formattedPriceSingle = currencyFormatter.format(Prices.SINGLE);
        String formattedPriceDouble = currencyFormatter.format(Prices.DOUBLE);
        String formattedPriceTriple = currencyFormatter.format(Prices.TRIPLE);
        String formattedPriceKids = currencyFormatter.format(Prices.KIDS);
        String formattedWafflePrice = currencyFormatter.format(Prices.WAFFLE);
        String formattedCandyPrice = currencyFormatter.format(Prices.CANDY);
        String formattedFruitPrice = currencyFormatter.format(Prices.FRUIT);
        String formattedNutsPrice = currencyFormatter.format(Prices.NUTS);
        String formattedSprinklesPrice = currencyFormatter.format(Prices.SPRINKLES);

        // Get the selected scoop
        String selectedScoop = ((RadioButton) scoopGroup.getSelectedToggle()).getText();

        //Build the string
        StringBuilder orderString = new StringBuilder();

        //Scoop
        orderString.append("***Order Summary***\n\n");
        orderString.append("SELECTED SCOOP: \n");
        if (selectedScoop.equalsIgnoreCase("kids")) {
            orderString.append(selectedScoop).append(" ").append(formattedPriceKids).append("\n");
            total += Prices.KIDS;
        }
        if (selectedScoop.equalsIgnoreCase("single")) {
            orderString.append(selectedScoop).append(" ").append(formattedPriceSingle).append("\n");
            total += Prices.SINGLE;
        }
        if (selectedScoop.equalsIgnoreCase("double")) {
            orderString.append(selectedScoop).append(" ").append(formattedPriceDouble).append("\n");
            total += Prices.DOUBLE;
        }
        if (selectedScoop.equalsIgnoreCase("triple")) {
            orderString.append(selectedScoop).append(" ").append(formattedPriceTriple).append("\n");
            total += Prices.TRIPLE;
        }
        orderString.append("\n");
        // Flavors
        orderString.append("SELECTED FLAVOR(S): \n");

        if (scoopBox1.getValue() != null) {
            orderString.append(scoopBox1.getValue()).append("\n");
        }
        if (scoopBox2.getValue() != null) {
            orderString.append(scoopBox2.getValue()).append("\n");
        }
        if (scoopBox3.getValue() != null) {
            orderString.append(scoopBox3.getValue()).append("\n");
        }
        orderString.append("\n");
        // Extras
        orderString.append("SELECTED EXTRAS:\n");
        if (checkBoxWaffle.isSelected()) {
            orderString.append("Waffle, ").append(formattedWafflePrice).append("\n");
            total += Prices.WAFFLE;
        }
        if (checkBoxCandy.isSelected()) {
            orderString.append("Candy, ").append(formattedCandyPrice).append("\n");
            total += Prices.CANDY;
        }
        if (checkBoxFruit.isSelected()) {
            orderString.append("Fruit, ").append(formattedFruitPrice).append("\n");
            total += Prices.FRUIT;
        }
        if (checkBoxNuts.isSelected()) {
            orderString.append("Nuts, ").append(formattedNutsPrice).append("\n");
            total += Prices.NUTS;
        }
        if (checkBoxSprinkles.isSelected()) {
            orderString.append("Sprinkles, ").append(formattedSprinklesPrice).append("\n");
            total += Prices.SPRINKLES;
        }
        if (!checkBoxWaffle.isSelected() && !checkBoxCandy.isSelected() && !checkBoxFruit.isSelected() && !checkBoxNuts.isSelected()) {
            orderString.append("No extras selected ").append("\n");
        }



        return orderString.toString();
    }

    @FXML
    void onCheckoutButtonClicked(ActionEvent event) {
        double tax = 0.05;
        double totalTax = total * tax;
        double totalWithTax = total + totalTax;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String formattedTotal = formatter.format(total);
        String formattedTotalWithTax = formatter.format(totalWithTax);
        textFieldTotal.setText(formattedTotal);
        textFieldTotalPrice.setText(formattedTotalWithTax);
        btnAdd.setDisable(true);
        btnCheckOut.setDisable(true);
        total = 0.00;


    }

    @FXML
    void onExitButtonClicked(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onNewOrderButtonClicked(ActionEvent event) {
        //Reset the app
        total = 0.00;
        resetOrder();
        btnCheckOut.setDisable(true);
        btnAdd.setDisable(false);
    }

    private void resetOrder() {
        //clear listview
        listViewOrderSummary.getItems().clear();

        //clear textview TotalPrice
        textFieldTotalPrice.clear();
        textFieldTotal.clear();
        //Set prompt text
        textFieldTotalPrice.setPromptText("Total Price after Tax");
        textFieldTotal.setPromptText("Total Price");

        //uncheck all extras
        checkBoxCandy.setSelected(false);
        checkBoxFruit.setSelected(false);
        checkBoxNuts.setSelected(false);
        checkBoxSprinkles.setSelected(false);
        checkBoxWaffle.setSelected(false);

        //Set up defaults
        setOnLoadDefaults();


    }

    @FXML
    void setDoubleDefault(ActionEvent event) {
        // enable scoopBoxes
        scoopBox2.setDisable(false);
        //Disable third scoop option & clear
        scoopBox3.setDisable(true);
        scoopBox3.setValue(null);
        // Set default values
        scoopBox1.setValue(Flavors.VANILLA);
        scoopBox2.setValue(Flavors.CHOCOLATE);
    }

    @FXML
    void setSingleDefault(ActionEvent event) {
        //Disable second and third scoop for Kids and Single
        scoopBox3.setDisable(true);
        scoopBox3.setValue(null);
        scoopBox2.setDisable(true);
        scoopBox2.setValue(null);

        //Set default flavor for kids and single
        scoopBox1.setValue(Flavors.VANILLA);
    }

    @FXML
    void setTripleDefault(ActionEvent event) {
        //Enable all combo boxes
        scoopBox3.setDisable(false);
        scoopBox2.setDisable(false);
        scoopBox1.setDisable(false);

        //set default flavors

        scoopBox1.setValue(Flavors.VANILLA);
        scoopBox2.setValue(Flavors.CHOCOLATE);
        scoopBox3.setValue(Flavors.STRAWBERRY);

    }

}//class
