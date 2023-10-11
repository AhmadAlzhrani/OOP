
package Lecture19;

import Lecture19.CancelHandlerClass;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class HandleEvent00 extends Application {
  
 
    
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    HBox pane = new HBox(10);
    pane.setAlignment(Pos.CENTER);
    Button btOK = new Button("OK");
    Button btCancel = new Button("Cancel");
    
    
    //OKHandlerClass handler1 = new OKHandlerClass();
    
    btOK.setOnAction(createActionEventHandler());
    btOK.setOnMouseClicked(mouseEventHandler());
    btOK.setOnKeyPressed(keyEventHandler());
     
     
    btCancel.setOnMouseClicked(mouseEventHandler());
    
    CancelHandlerClass handler2= new CancelHandlerClass();
    btCancel.setOnAction(handler2);
    pane.getChildren().addAll(btOK, btCancel);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("HandleEvent"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

    EventHandler<ActionEvent> handler = new 
                     EventHandler<ActionEvent>() { 
        @Override
        public void handle(ActionEvent e){ 
            System.out.println("ABC");
        } 
    }; 
    
  public static void main(String[] args) {
    launch(args);
  }
 
    private EventHandler<MouseEvent> mouseEventHandler(){
        // action event 
          EventHandler<MouseEvent> event = (MouseEvent e) -> {
              System.out.println("Mouse button clicked"); 
          }; 
    return event;
    }
    
    private EventHandler<MouseEvent> mouseEventHandler1(){
        
        EventHandler<MouseEvent> myHandler;
        myHandler = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Mouse event");
            }
        };
        
        return myHandler;
        
        
    }

    private EventHandler<KeyEvent> keyEventHandler(){
        // action event 
          EventHandler<KeyEvent> event = (KeyEvent e) -> {
              System.out.println("Key button clicked"); 
          }; 
    return event;
    }

    private EventHandler<KeyEvent> keyEventHandler1(){
        
        EventHandler myHandler;
        myHandler = new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event) {
                 System.out.println("Key pressed"); 
            }
    };
    
        return myHandler;
        
    }

    private EventHandler<ActionEvent> createActionEventHandler(){
       // action event 
         EventHandler<ActionEvent> event = (ActionEvent e) -> {
             System.out.println("OK button clicked"); 
         }; 
    return event;
    }

    private EventHandler<ActionEvent> createActionEventHandler1(){
        EventHandler<ActionEvent> myHandler;
        myHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)
            {
                System.out.println("OK button clicked");
            }  
        };
        return myHandler;
    }

  
} 

class HandlerClass implements EventHandler<ActionEvent> {
   Alert a = new Alert(AlertType.NONE); 
   @Override
  public void handle(ActionEvent e) {
    
      if (( (Button) e.getSource()).getText().equals("OK"))
           System.out.println("OK 1 button clicked"); 
      else
           System.out.println("Cancel 1  button clicked"); 
  }
}

class CancelHandlerClass1 implements EventHandler<ActionEvent> {
   Alert a = new Alert(AlertType.NONE); 
   
   @Override
  public void handle(ActionEvent e) {
     System.out.println("Cancel 2 button clicked");
     a.setAlertType(AlertType.CONFIRMATION); 
     a.setHeaderText("Continu");
     a.setTitle("Do Cancel?");
                a.show(); 
  }
}