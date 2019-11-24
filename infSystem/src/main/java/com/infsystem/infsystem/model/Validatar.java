/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

import java.util.function.UnaryOperator;
import javafx.scene.control.TextFormatter.Change;

/**
 *
 * @author dxdjf
 */
public class Validatar {

    public static UnaryOperator<Change> integerFilter = change -> {
        String text = change.getControlNewText();
        if (text.matches("-?([1-9][0-9]*)?")) {
            return change;
        }
        return null;
    };
}
