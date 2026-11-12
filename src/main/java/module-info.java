module com.mac190.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mac190.demofx to javafx.fxml;
    exports com.mac190.demofx;
}