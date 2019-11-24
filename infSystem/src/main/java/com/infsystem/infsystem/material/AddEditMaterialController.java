package com.infsystem.infsystem.material;

import com.infsystem.infsystem.common.DialogBox;
import com.infsystem.infsystem.model.MaterialSuplier;
import com.infsystem.infsystem.model.NameIdModel;
import com.infsystem.infsystem.service.IMaterialService;
import com.infsystem.infsystem.service.MaterialService;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class AddEditMaterialController {
    
    @FXML
    private AnchorPane uiPane;
    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private URL location;
    
    @FXML
    private TextField code;
    
    @FXML
    private TextArea description;
    
    @FXML
    private TableView<MaterialSuplier> suplierMaterial;
    
    @FXML
    private TableColumn<MaterialSuplier, String> suplierMaterialName;
    
    @FXML
    private TableColumn<MaterialSuplier, Float> suplierMaterialPrice;
    
    @FXML
    private TextField pendingqty;
    
    @FXML
    private TextField availableqty;
    
    @FXML
    private TextField trigerLimit;
    
    @FXML
    private TextField price;
    
    @FXML
    private ChoiceBox<NameIdModel> suplier;
    @FXML
    private ChoiceBox<NameIdModel> category;
    
    @FXML
    private TextField brand;
    
    @FXML
    void add(ActionEvent event) {
        if (price.getText().equals("")) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Cost");
            return;
        }
        
        MaterialSuplier matSup = new MaterialSuplier();
        
        try {
            matSup.suplierId = suplier.getValue().getId();
            matSup.suplierName = suplier.getValue().getName();
            
        } catch (Exception e) {
            dialog.showError(this.uiPane, "Fill the required feilds", "Please select address type");
            return;
        }
        matSup.price = Float.parseFloat(price.getText());
        materialSupplier.add(matSup);
    }
    
    @FXML
    void save(ActionEvent event) {
        
    }
    public ObservableList<MaterialSuplier> materialSupplier = FXCollections.observableArrayList();
    IMaterialService material;
    DialogBox dialog = DialogBox.create();
    
    @FXML
    void initialize() {
        /**
         * init user service
         */
        try {
            material = new MaterialService();
        } catch (SQLException ex) {
            dialog.showError(this.uiPane, "Error", "Canot connect database server");
        }
        suplierMaterialName.setCellValueFactory(new PropertyValueFactory<>("suplierName"));
        suplierMaterialPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        suplierMaterial.setItems(materialSupplier);
        
        List<NameIdModel> category = material.getMaterialCategory();
        this.category.setItems(FXCollections.observableArrayList(category));
        
        List<NameIdModel> supplier = material.getMaterialSuplier();
        this.suplier.setItems(FXCollections.observableArrayList(supplier));
        
    }
}
