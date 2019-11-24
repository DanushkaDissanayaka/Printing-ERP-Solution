package com.infsystem.infsystem.User;

import com.infsystem.infsystem.common.DialogBox;
import com.infsystem.infsystem.model.Address;
import com.infsystem.infsystem.model.Client;
import com.infsystem.infsystem.model.ContactEditModel;
import com.infsystem.infsystem.model.NameIdModel;
import com.infsystem.infsystem.model.PersonEditModel;
import com.infsystem.infsystem.service.IUserService;
import com.infsystem.infsystem.service.UserService;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class CreateEditPersonController {

    /**
     * FXML setup
     */
    @FXML
    private AnchorPane uiPane;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> clientNameTitle;

    @FXML
    private TextField companyName;

    @FXML
    private TextField clientFname;

    @FXML
    private TextField clientLname;

    @FXML
    private TextField clientPosition;

    @FXML
    private TextField clientMobile;

    @FXML
    private TextField clientLandPhone;

    @FXML
    private TextField clientFax;

    @FXML
    private TextField clientEmail;

    @FXML
    private TextField clientWebSite;

    @FXML
    private DatePicker dob;

    @FXML
    private TextField nic;

    @FXML
    private ChoiceBox<NameIdModel> addressType;

    @FXML
    private TextField clientNo;

    @FXML
    private TextField clientAdd01;

    @FXML
    private TextField clientAdd02;

    @FXML
    private TextField clientAdd03;

    @FXML
    private TextField clientCity;

    @FXML
    private TableView<Address> clientAddressTable;

    @FXML
    private TableColumn<Address, String> clientAddNo;

    @FXML
    private TableColumn<Address, String> clientAdd01Column;

    @FXML
    private TableColumn<Address, String> clientAdd02Column;

    @FXML
    private TableColumn<Address, String> clientAdd03Column;

    @FXML
    private TableColumn<Address, String> clientAddCityColumn;

    @FXML
    private ChoiceBox<NameIdModel> personType;

    @FXML
    void addAddress(MouseEvent event) {
        if (clientNo.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Address No required");
            return;
        }
        if (clientCity.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "City required");
            return;
        }

        Address address = new Address();
        try {
            address.type = addressType.getValue().getId();
        } catch (Exception e) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Please select address type");
            return;
        }
        address.setNo(clientNo.getText());
        address.setAddress1(clientAdd01.getText());
        address.setAddress2(clientAdd02.getText());
        address.setAddress3(clientAdd03.getText());
        address.setCity(clientCity.getText());
        this.addressList.add(address);
        /**
         * After add clear the text boxes
         */
        clientNo.clear();
        clientAdd01.clear();
        clientAdd02.clear();
        clientAdd03.clear();
        clientCity.clear();

    }

    @FXML
    void clearAddressTable(MouseEvent event) {
        this.addressList.clear();
    }

    @FXML
    void custromerAccount(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

        if (clientFname.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "First name required");
            return;
        }
        if (nic.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "N.I.C required");
            return;
        }
        if (clientLname.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Last name required");
            return;
        }

        if (clientPosition.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Position required");
            return;
        }
        if (companyName.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Company name required");
            return;
        }

        if (this.addressList.size() < 1) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Atleast one address required");
        }

        PersonEditModel person = new PersonEditModel();

        if (clientMobile.getText().equals("") && clientLandPhone.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Atleast one contact number required");
            return;
        } else {

            if (!clientMobile.getText().equals("")) {
                ContactEditModel mobile = new ContactEditModel();
                mobile.number = clientMobile.getText();
                person.contact.add(mobile);
            }
            if (!clientLandPhone.getText().equals("")) {
                ContactEditModel land = new ContactEditModel();
                land.number = clientLandPhone.getText();
                person.contact.add(land);
            }
        }
        try {
            person.type = personType.getValue().getId();
        } catch (Exception e) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Please select Person type");
            return;
        }
        person.address = this.addressList;
        person.fName = clientFname.getText();
        person.lName = clientLname.getText();
        person.companyName = companyName.getText();
        person.email = clientEmail.getText();

        //person.dob = dob.getConverter();
        //clientPosition;
        //clientFax;
        //clientWebSite;
        String msg = this.user.createPerson(person);
        dialog.showError(this.uiPane, "Info", msg);
    }

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

        /**
         * Set user type list
         */
        List<NameIdModel> personType = user.getUserType();
        List<NameIdModel> addressType = user.getAddressType();

        this.personType.setItems(FXCollections.observableArrayList(personType));
        /**
         * Set address type list
         */
        this.addressType.setItems(FXCollections.observableArrayList(addressType));
        /**
         * Init address table
         */
        clientAddNo.setCellValueFactory(new PropertyValueFactory<>("no"));
        clientAdd01Column.setCellValueFactory(new PropertyValueFactory<>("address1"));
        clientAdd02Column.setCellValueFactory(new PropertyValueFactory<>("address2"));
        clientAdd03Column.setCellValueFactory(new PropertyValueFactory<>("address3"));
        clientAddCityColumn.setCellValueFactory(new PropertyValueFactory<>("city"));
        clientAddressTable.setItems(addressList);

        clientAddressTable.setRowFactory(tv -> {
            TableRow<Address> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    Address rowData = row.getItem();
                    this.addressList.remove(rowData);
                }
            });
            return row;
        });
        this.clientNameTitle.setItems(FXCollections.observableArrayList("Mr.", "Ms.", "Mrs.", "Miss.", "Dr.", "Rev."));
        this.clientNameTitle.setTooltip(new Tooltip("Select Title"));
        this.clientNameTitle.setValue("Mr.");

        if (this.isEdit == true) {
            // get client details
        } else {
            // Do nothing this is create new customer
        }
    }

    // Create observable list for address table
    public ObservableList<Address> addressList = FXCollections.observableArrayList();
    // Create observable List for view client table
    public ObservableList<Client> clientList = FXCollections.observableArrayList();
    //User service
    IUserService user;

    /**
     * DialogBox for the error
     */
    DialogBox dialog = DialogBox.create();

    /**
     * Private variable in class
     */
    private Boolean isEdit = false;
    private int clientId = 0;

    /**
     * @param clientId id of client to edit if this is a new client id should be
     * 0
     */
    public void initDate(int clientId) {
        if (clientId > 0) {
            // this is an edit
            this.isEdit = true;
            this.clientId = clientId;
        } else {
            //this is a create
            this.isEdit = false;
        }
    }
}
