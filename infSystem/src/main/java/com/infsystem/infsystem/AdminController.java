package com.infsystem.infsystem;

import com.infsystem.infsystem.model.Chapter;
import com.infsystem.infsystem.model.Client;
import com.infsystem.infsystem.model.Validatar;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.IntegerStringConverter;

public class AdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField productCode;

    @FXML
    private TextField productName;

    @FXML
    private TextField productLanguage;

    @FXML
    private TextField subjectName;

    @FXML
    private TextField productAuthor;

    @FXML
    private TextField TrigarLimit;

    @FXML
    private TableView<Chapter> chapterTeble;

    @FXML
    private TableColumn<Chapter, String> chapterTableCode;

    @FXML
    private TableColumn<Chapter, String> chapterTableName;

    @FXML
    private TableColumn<Chapter, Integer> chapterNosPgsForChapter;

    @FXML
    private TableColumn<Chapter, String> chapterTableMaterial;

    @FXML
    private TextField chapterCode;

    @FXML
    private TextField chapterName;

    @FXML
    private TextField noOfPagesPerchapter;

    @FXML
    private TextField productBilingPrice;

    @FXML
    private TextField productEndUserPrice;

    @FXML
    private TextField productCostPreUnit;

    @FXML
    private ChoiceBox<?> productType;

    @FXML
    private ChoiceBox<?> pickMaterial;

    @FXML
    void addChapter(MouseEvent event) {
        //validate feilds
        // create new chapter
        Chapter chapter = new Chapter();
        //add to chapterArray
        this.chapterList.add(chapter);
    }

    @FXML
    void clear(MouseEvent event) {
        // clear entire form
    }

    @FXML
    void saveUpdate(MouseEvent event) {
        // save book object
    }

    // create chapter arry to set table
    public ObservableList<Chapter> chapterList = FXCollections.observableArrayList();

    @FXML
    void initialize() {
    }

    @FXML
    void addNewProductTab(Event event) {
        // init tab

        //init table
        chapterTableCode.setCellValueFactory(new PropertyValueFactory<>("ChapterCode"));
        chapterTableName.setCellValueFactory(new PropertyValueFactory<>("ChapterName"));
        chapterNosPgsForChapter.setCellValueFactory(new PropertyValueFactory<>("noOfPages"));
        chapterTableMaterial.setCellValueFactory(new PropertyValueFactory<>("materialCode"));
        chapterTeble.setItems(chapterList);

        // add validators
        TrigarLimit.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), 0, Validatar.integerFilter));
        noOfPagesPerchapter.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), 0, Validatar.integerFilter));
        productBilingPrice.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), 0, Validatar.integerFilter));
        productEndUserPrice.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), 0, Validatar.integerFilter));
        productCostPreUnit.setTextFormatter(new TextFormatter<Integer>(new IntegerStringConverter(), 0, Validatar.integerFilter));
    }
}
