package com.infsystem.infsystem;

import com.infsystem.infsystem.model.Address;
import com.infsystem.infsystem.model.Client;
import com.infsystem.infsystem.model.Contact;
import com.infsystem.infsystem.model.NameIdModel;
import com.infsystem.infsystem.service.UserService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FinanceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField clientViewSearch;

    @FXML
    private ChoiceBox<?> clientViweSelectType;

    @FXML
    private TableView<Client> clientViewTable;

    @FXML
    private TableColumn<Client, String> clientViewID;

    @FXML
    private TableColumn<Client, String> clientViewAddress;

    @FXML
    private TableColumn<Client, String> clientViewCompany;

    @FXML
    private TableColumn<Client, String> clientJobTitle;

    @FXML
    private Tab viewClientTabFxml;

    @FXML
    private StackPane basePane;


    @FXML
    private AnchorPane uiPane;


    @FXML
    void SearchClient(MouseEvent event) {

    }

    @FXML
    void loadClientViewTab(Event event) {
        if (viewClientTabFxml.isSelected()) {
            // load add client tab function and veriables
            this.viewClientTab();
        }
    }

    @FXML
    void addPerson(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/User/CreateEditPerson.fxml"));
        Scene scene;
        try {
            scene = new Scene(loader.load(), 824, 768);
            Stage stage = new Stage();
            stage.setTitle("Add");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FinanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void addEditMaterial(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Material/AddEditMaterial.fxml"));
        Scene scene;
        try {
            scene = new Scene(loader.load(), 824, 768);
            Stage stage = new Stage();
            stage.setTitle("Add Material");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FinanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Create dialogBox To show errors
    DialogBox dialog = DialogBox.create();
    // Create observable list for address table
    public ObservableList<Address> addressList = FXCollections.observableArrayList();
    // Create observable List for view client table
    public ObservableList<Client> clientList = FXCollections.observableArrayList();
    //User service
    UserService user;

    // person types
    @FXML
    void initialize() {
        /**
         * init user service
         */
        try {
            user = new UserService();
        } catch (SQLException ex) {
            dialog.showError(this.uiPane, "Error", "Canot connect database server");
        }
    }

    void viewClientTab() {
        clientViewID.setCellValueFactory(new PropertyValueFactory<>("clientId"));
        clientViewAddress.setCellValueFactory(new PropertyValueFactory<>("shippingAddress"));
        clientViewCompany.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        clientJobTitle.setCellValueFactory(new PropertyValueFactory<>("JobTitle"));
        clientViewTable.setItems(clientList);

        clientViewTable.setRowFactory(tv -> {
            TableRow<Client> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    Client rowData = row.getItem();
                    try {
                        this.viewClientDetails(rowData, event);
                    } catch (IOException ex) {
                        Logger.getLogger(FinanceController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            return row;
        });
    }

    void viewClientDetails(Client client, MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/ClientView.fxml"));
        Parent clientViewParent = loader.load();

        Scene tableViewScene = new Scene(clientViewParent);
        ClientViewController controller = loader.getController();
        controller.initData(client);
        basePane.getChildren().setAll(clientViewParent);
    }
}
