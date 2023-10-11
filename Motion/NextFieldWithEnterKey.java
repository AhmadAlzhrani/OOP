/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture19;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
 
public class NextFieldWithEnterKey extends Application {
    private TextField fieldOne = new TextField();
    private TextField fieldTwo = new TextField();
    private TextField fieldThree = new TextField();
     
    @Override
    public void start(Stage stage) throws Exception {
        EventHandler<? super KeyEvent> keyPressedProcessing = e -> processKeyPress(e);
         
        fieldOne.setOnKeyPressed(keyPressedProcessing);
        fieldTwo.setOnKeyPressed(keyPressedProcessing);
        fieldThree.setOnKeyPressed(keyPressedProcessing);
         
        GridPane grid = new GridPane();
        grid.addRow(0, new Label("First Field:"), fieldOne);
        grid.addRow(1, new Label("Second Field:"), fieldTwo);
        grid.addRow(2, new Label("Third Field:"), fieldThree);
         
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Test Advance With Enter Key");
        stage.show();
    }
     
    private void processKeyPress(KeyEvent e) {
        if (e.getCode() != KeyCode.ENTER) {
            return;
        }
         
        if (e.getSource() == fieldOne) {
            // call process method
            fieldTwo.requestFocus();
        } else if (e.getSource() == fieldTwo) {
            // call process method
            fieldThree.requestFocus();
        } else if (e.getSource() == fieldThree) {
            // call process method
            fieldOne.requestFocus();
        }
    }
     
    public static void main(String[] args) {
        launch();
    }
}