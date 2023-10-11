/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture20;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HandlerDemo extends Application {
  Text text = new Text(40, 40, "Programming is fun");
  Pane pane = new Pane(text);
  @Override 
  public void start(Stage primaryStage) {

    Button btUp = new Button("Up");
    Button btDown = new Button("Down");
    Button btLeft = new Button("Left");
    Button btRight = new Button("Right");
    HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    
    BorderPane borderPane = new BorderPane(pane);
    borderPane.setBottom(hBox);
    // Create and register the handler
    btUp.setOnAction(new MoveUPHandler());

    btDown.setOnAction(new EventHandler<ActionEvent>() {
      @Override 
      public void handle(ActionEvent e) {
        text.setY(text.getY() < pane.getHeight() ? 
          text.getY() + 5 : pane.getHeight());
      }
    });
    
    btLeft.setOnAction( (ActionEvent e) -> {
        text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
    });
    
    btRight.setOnAction(moveRightHandler);

    Scene scene = new Scene(borderPane, 400, 350);
    primaryStage.setScene(scene);
    primaryStage.setTitle(" Handlers Demo"); 
    primaryStage.show(); 
  }
  
  
  class MoveUPHandler implements EventHandler<ActionEvent> {
       @Override
       public void handle(ActionEvent e) {
        text.setY(text.getY() > 10 ? text.getY() - 5 : 10);
      }
    
    }
  
  EventHandler<ActionEvent>  moveRightHandler  = 
          new  EventHandler<ActionEvent>() {
       @Override
       public void handle(ActionEvent e) {
        text.setX(text.getX() < pane.getWidth() - 100?
                text.getX() + 5 : pane.getWidth() - 100);
      }
    };
  
   EventHandler<ActionEvent>  moveRightHandler2  =  (ActionEvent  e) ->  {
        text.setX(text.getX() < pane.getWidth() - 100?
                text.getX() + 5 : pane.getWidth() - 100);
    };
 
  public static void main(String[] args) {
    launch(args);
  }
  
}