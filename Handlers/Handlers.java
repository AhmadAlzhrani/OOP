package Lecture20;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Handlers extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    
        HBox hbox = new HBox(10);
        Button innerButton = new Button("Inner Class");
        innerButton.setOnAction(new myHandler1());
        
        Button anonymousButton = new Button("Anonymous Class");
        anonymousButton.setOnAction(
                new 
                EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event) {
                        // Process the event.
                        showMessage( ((Button) event.getSource()).getText() );
                    }
                }
        );
        
        Button lambdaButton = new Button("Lambda");
        lambdaButton.setOnAction( 
                (ActionEvent e) -> 
                { showMessage( ((Button) e.getSource()).getText()); } 
        );
        
        hbox.setAlignment(Pos.CENTER);
        
        hbox.getChildren().addAll(
                innerButton,anonymousButton,lambdaButton);
        Scene scene = new Scene(hbox,400,100);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Handler Creation");
        primaryStage.show();
    }
    
    class myHandler1 implements EventHandler<ActionEvent> {
        @Override 
        public void handle(ActionEvent e) {
            // Process the event.    
            showMessage( ((Button) e.getSource()).getText() );
        }
    }
  
  EventHandler<ActionEvent> myHandler2 = new 
                     EventHandler<ActionEvent>(){
      @Override
      public void handle(ActionEvent e) {
          // Process the event.
          showMessage( ((Button) e.getSource()).getText() );
      }
    };
  
 
  EventHandler<ActionEvent> myHandler3 = (ActionEvent e) -> {
      // Process the event.
       showMessage( ((Button) e.getSource()).getText() );
  };
  
  
  private void showMessage(String msg){
          Alert a = new Alert(Alert.AlertType.NONE); 
          a.setAlertType(Alert.AlertType.INFORMATION); 
          a.setHeaderText(msg);
          a.setTitle("Handler Type");  a.show(); 
    }
    
    
 
  public static void main(String[] args) {
    launch(args);
  }
    
    
}
