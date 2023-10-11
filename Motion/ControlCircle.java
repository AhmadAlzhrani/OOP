
package Lecture19;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControlCircle extends Application {
    
  private final CirclePane circlePane = new CirclePane();
  
  @Override
  public void start(Stage primaryStage) {
    
    HBox hBox = new HBox(10);
    hBox.setSpacing(10);
    hBox.setPadding(new Insets(15,15,15,15));
    hBox.setAlignment(Pos.CENTER);
    
    
    Button btEnlarge = new Button("Enlarge");
    btEnlarge.setId("Enlarge");
    
    Button btShrink = new Button("Shrink");
    btShrink.setId("Shrink");
     
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
    // Create and register the handler
    btEnlarge.setOnAction(new changeSizeHandler());
    
    btShrink.setOnAction(new changeSizeHandler() );

    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);
   
    Scene scene = new Scene(borderPane, 200, 150);
    primaryStage.setTitle("ControlCircle"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  class changeSizeHandler implements EventHandler<ActionEvent> 
  {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
        
        String btName = ( (Button) e.getSource()).getId();
        if(btName.equals("Enlarge"))
        //if(e.getSource()== btEnlarge)
            circlePane.enlarge();
        else
            circlePane.shrink();
    }
  }
  

  public static void main(String[] args) {
    launch(args);
  }
  
  
class EnlargeHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
        circlePane.enlarge();
    }
}

class ShrinkHandler implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
        circlePane.enlarge();
    }
}
  
  
}

