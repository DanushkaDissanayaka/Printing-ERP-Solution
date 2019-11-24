package com.infsystem.infsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;

    @FXML
    private StackPane subPane;

    @FXML
    void loadProduction(MouseEvent event) throws IOException {
        this.loadInterface("/fxml/production.fxml");
    }

    @FXML
    void loadFinance(MouseEvent event) throws IOException {
        this.loadInterface("/fxml/finance.fxml");
    }

    @FXML
    void initialize() throws IOException {
        assert subPane != null : "fx:id=\"subPane\" was not injected: check your FXML file 'Main.fxml'.";
        this.loadInterface("/fxml/production.fxml");
    }

    @FXML
    void loadAdmin(MouseEvent event) throws IOException {
        this.loadInterface("/fxml/Admin.fxml");
    }

    @FXML
    void LoadInventry(MouseEvent event) throws IOException {
        this.loadInterface("/fxml/Inventry.fxml");

    }

    void loadInterface(String path) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource(path));
        subPane.getChildren().setAll(pane);
    }
}
