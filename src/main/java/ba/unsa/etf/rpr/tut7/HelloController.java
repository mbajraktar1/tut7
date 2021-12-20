package ba.unsa.etf.rpr.tut7;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import static javafx.application.Platform.exit;

public class HelloController {
    @FXML
    private TextField ime;

    @FXML
    private TextField prezime;

    @FXML
    private TextField email;

    @FXML
    private TextField korisnickoIme;

    @FXML
    private TextField lozinka;

    @FXML
    private ListView

    @FXML
    protected void onDodajClicked() {
        ime.setText("Merjem");
        prezime.setText("Bajraktarevic");
        email.setText("mbajraktar1@etf.unsa.ba");
        korisnickoIme.setText("mbajraktar1");
        lozinka.setText("mojPass");
    }

    @FXML
    protected void onKrajClicked() {
        exit();
    }
}