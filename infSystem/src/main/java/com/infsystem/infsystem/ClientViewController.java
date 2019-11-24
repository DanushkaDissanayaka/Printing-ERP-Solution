package com.infsystem.infsystem;

import com.infsystem.infsystem.model.Address;
import com.infsystem.infsystem.model.Client;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClientViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    Label clientId;
    @FXML
    Label name;
    @FXML
    Label compayName;
    @FXML
    Label jobTitle;
    @FXML
    Label email;
    @FXML
    Label shippingAddress;

    public void initData(Client client) {
        Client newClient = client;
        clientId.setText(newClient.getClientId());
        name.setText(newClient.getFirstName() + newClient.getLastName());
        compayName.setText(newClient.getCompanyName());
        jobTitle.setText(newClient.getJobTitle());
        email.setText(newClient.getEmail());
        shippingAddress.setText(newClient.getShippingAddress());
    }

    @FXML
    void INVCreditDebitDetails(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Finance/INV_Credit_Debit_Details.fxml"));
        loadSubforms(loader, 600, 400, "INV Credit/Debit Details");
    }

    @FXML
    void INVDiscountDetails(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Finance/INV_Discount_Details.fxml"));
        loadSubforms(loader, 600, 400, "INV Discount Details");
    }

    @FXML
    void INVPayments(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Finance/INV_Payment_Details.fxml"));
        loadSubforms(loader, 900, 400, "INV Payment Details");
    }

    @FXML
    void InvReturnDetails(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Finance/INV_Return_Details.fxml"));
        loadSubforms(loader, 800, 400, "INV Return Details");
    }

    @FXML
    void ProItemsDetails(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Finance/Pro_Items_Details.fxml"));
        loadSubforms(loader, 800, 400, "Pro.Items Details");
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
