package com.infsystem.infsystem;

import com.infsystem.infsystem.model.PrintMaterial;
import com.infsystem.infsystem.model.Validatar;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

public class productionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    /*
    * In house order setup
     */
    @FXML
    private Label InhouseDate;

    @FXML
    private TextField inOderCode;

    @FXML
    private TextField inHousePrintQty;

    @FXML
    private TableView<PrintMaterial> InhousePrintMaterialTable;

    @FXML
    private TableColumn<PrintMaterial, String> inHousePrintMaterialNameColumn;

    @FXML
    private TableColumn<PrintMaterial, String> InhousePrintTableColumnItem;

    @FXML
    private TableColumn<PrintMaterial, Integer> inHousePrintTableQuntityolumn;

    @FXML
    private Tab inHousePrintTab;

    @FXML
    void loadInhouseprintTab(Event event) {
        if (inHousePrintTab.isSelected()) {
            this.inHouseTab();
        }
    }
    /*
     * END In house order SETUP
     */

    /**
     * Outsource print
     */
    @FXML
    private ChoiceBox<PrintMaterial> outAddressPic;

    @FXML
    private Label outAddressLable;

    @FXML
    private TableView<PrintMaterial> outMatTable;

    @FXML
    private TableColumn<PrintMaterial, String> outMatNameColumn;

    @FXML
    private TableColumn<PrintMaterial, String> outMatItmCdColumn;

    @FXML
    private TableColumn<PrintMaterial, Integer> outMatQtyColumn;

    @FXML
    private ChoiceBox<PrintMaterial> outMatpick;

    @FXML
    private TextField outMatQty;

    @FXML
    private Label outMatQtyLabel;

    @FXML
    private Tab outsourcePrint;

    @FXML
    private Label outSourcePrintProcessingDate;

    @FXML
    void loadTab(Event event) {
        if (outsourcePrint.isSelected()) {
            this.loadOutsourcePrintTab();
        }
    }

    /**
     *
     */
    public ObservableList<PrintMaterial> list = FXCollections.observableArrayList(new PrintMaterial(5, "PP001", "A4 Sheets"),
            new PrintMaterial(5, "PP002", "A3 Sheets")
    );

    @FXML
    void initialize() {

    }

    /**
     * Outsource print tab init
     */
    void loadOutsourcePrintTab() {
        outMatNameColumn.setCellValueFactory(new PropertyValueFactory<PrintMaterial, String>("itemName"));
        outMatItmCdColumn.setCellValueFactory(new PropertyValueFactory<PrintMaterial, String>("itemCode"));
        outMatQtyColumn.setCellValueFactory(new PropertyValueFactory<PrintMaterial, Integer>("quentity"));
        outMatTable.setItems(list);
        /**
         * Table item remove event
         */
        outMatTable.setRowFactory(tv -> {
            TableRow<PrintMaterial> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    PrintMaterial rowData = row.getItem();
                    this.list.remove(rowData);
                }
            });
            return row;
        });
        /**
         * Set LocalDateTime To label
         *
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        outSourcePrintProcessingDate.setText(dtf.format((LocalDateTime.now())));
    }

    void inHouseTab() {
        /**
         * In house print table setup
         */
        inHousePrintQty.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), 0, Validatar.integerFilter));
        inHousePrintMaterialNameColumn.setCellValueFactory(new PropertyValueFactory<PrintMaterial, String>("itemName"));
        InhousePrintTableColumnItem.setCellValueFactory(new PropertyValueFactory<PrintMaterial, String>("itemCode"));
        inHousePrintTableQuntityolumn.setCellValueFactory(new PropertyValueFactory<PrintMaterial, Integer>("quentity"));
        InhousePrintMaterialTable.setItems(list);
        /**
         * Table item remove event
         */
        InhousePrintMaterialTable.setRowFactory(tv -> {
            TableRow<PrintMaterial> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    PrintMaterial rowData = row.getItem();
                    this.list.remove(rowData);
                }
            });
            return row;
        });
        /**
         * Set LocalDateTime To label
         *
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        InhouseDate.setText(dtf.format((LocalDateTime.now())));
    }

    @FXML
    void SearchPrintDefined(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/Production/SearchPrintJob.fxml"));
        loadSubforms(loader, 824, 500, "Pro.Items Details");
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
