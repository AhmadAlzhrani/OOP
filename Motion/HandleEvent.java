package Lecture19;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
  @Override 
  public void start(Stage primaryStage){
    
    HBox pane = new HBox(50);
    pane.setAlignment(Pos.CENTER);
    
    Button btOK = new Button("OK");
    OKHandlerClass handler1 = new OKHandlerClass();
    btOK.setOnAction(handler1);
    
    Button btCancel = new Button("Cancel");
    CancelHandlerClass handler2 = new CancelHandlerClass();
    btCancel.setOnAction(handler2);
    
    pane.getChildren().addAll(btOK, btCancel);
    
    Scene scene = new Scene(pane,200,50);
    primaryStage.setScene(scene); 
    primaryStage.setTitle("HandleEvent");
    primaryStage.show(); 
  }


  public static void main(String[] args) {
    launch(args);
  }
} 

class OKHandlerClass implements EventHandler<ActionEvent> {
    
  @Override
  public void handle(ActionEvent e) {
    System.out.println("OK button clicked"); 
  }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
    
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
  
}