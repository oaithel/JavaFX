module com.mac190.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    //requires com.mac190.demofx;


    opens com.mac190.demofx to javafx.fxml;
    exports com.mac190.demofx;
    exports com.mac190.realcalculator;
}