package com.infsystem.infsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InventryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void MaterialStockViewMaterial(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/stock/ViewItemDetails.fxml"));
        loadSubforms(loader, 800, 571, "View Material Details");
    }

    @FXML
    void ProductionStockViewProduction(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/stock/ViewProductDetails.fxml"));
        loadSubforms(loader, 824, 403, "View Product Details");
    }

    @FXML
    void initialize() {

    }

    void loadSubforms(FXMLLoader ldr, int resX, int resY, String title) {
        Scene scene;
        try {
            scene = new Scene(ldr.load(), resX, resY);
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(FinanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
