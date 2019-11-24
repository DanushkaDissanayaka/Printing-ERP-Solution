package com.infsystem.infsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private AnchorPane uiPane;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        dialog.showError(uiPane, "Heading", "Content");
    }

    @FXML
    private void handleButton1Action(ActionEvent event) {
        dialog.showError(uiPane, "Hedding1", "Content1");
    }

    DialogBox dialog = DialogBox.create();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
