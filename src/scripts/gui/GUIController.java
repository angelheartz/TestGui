package scripts.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class GUIController implements Initializable {

    private GUI gui;

    public void setGUI(GUI gui) {
        this.gui = gui;
    }

    public GUI getGUI() {
        return this.gui;
    }

    @FXML
    private Button startScriptButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void startScriptPressed() {
        System.out.println("WORKS");
    }
}
