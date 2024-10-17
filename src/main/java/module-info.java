module com.example.kulb_test1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.example.kulb_test1 to javafx.fxml;
    exports com.example.kulb_test1;
}