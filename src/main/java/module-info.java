module ba.unsa.etf.rpr.tut7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ba.unsa.etf.rpr.tut7 to javafx.fxml;
    exports ba.unsa.etf.rpr.tut7;
}