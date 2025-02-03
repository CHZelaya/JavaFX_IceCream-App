module org.example.javafx_icecreamapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.javafx_icecreamapp to javafx.fxml;
    exports org.example.javafx_icecreamapp;
}