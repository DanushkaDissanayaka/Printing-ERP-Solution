/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.common;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 *
 * @author dxdjf
 */
public class DialogBox {

    JFXDialogLayout content;
    JFXButton okayBtn = new JFXButton("Ok");
    JFXDialog dialog;
    StackPane pane;
    private static DialogBox box = null;

    private DialogBox() {
        this.content = new JFXDialogLayout();
        content.setPrefSize(400, 150);
        pane = new StackPane();
        pane.autosize();
        okayBtn.setOnAction((ActionEvent e) -> {
            dialog.close();
        });
        okayBtn.setButtonType(JFXButton.ButtonType.RAISED);
        okayBtn.setPrefSize(60, 35);
        okayBtn.setStyle("-fx-background-color: #DC3545; -fx-text-fill: white;");
    }

    //singleton patern
    public static DialogBox create() {
        if (box == null) {
            box = new DialogBox();
        } else {
            // doNothig
        }
        return box;
    }

    public void showError(AnchorPane uiPane, String heading, String body) {
        content.setHeading(new Text(heading));
        content.setBody(new Text(body));
        dialog = new JFXDialog(pane, content, JFXDialog.DialogTransition.LEFT, true);
        content.setActions(okayBtn);
        try {
            uiPane.getChildren().add(pane);
        } catch (IllegalArgumentException e) {
            //Do nothing
        }
        AnchorPane.setTopAnchor(pane, (uiPane.getHeight() - content.getPrefHeight()) / 2);
        AnchorPane.setLeftAnchor(pane, (uiPane.getWidth() - content.getPrefWidth()) / 2);
        dialog.show();
    }
}
