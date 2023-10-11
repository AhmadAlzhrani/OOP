
package Lecture22;
import java.awt.Color;
import java.awt.Paint;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemo extends Application {
  
  protected Text text = 
          new Text(50, 50, "ICS108: Object Oriented Programming");
  @Override 
  public void start(Stage primaryStage) {
    Scene scene = new Scene(getPane(), 500, 200);
    primaryStage.setTitle("ButtonDemo"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  protected BorderPane getPane() {
    
    Button btLeft = new Button("Left",  
      new ImageView( new Image("lec22/left.gif") ) );
    Button btRight = new Button("Right");
    btRight.setGraphic( new ImageView( new Image("lec22/right.gif") ) );   
    btRight.setDefaultButton(true);
    
    HBox paneForButtons = new HBox(20);
    paneForButtons.getChildren().addAll(btLeft, btRight);
    paneForButtons.setAlignment(Pos.CENTER);
    paneForButtons.setStyle("-fx-border-color: green");

    BorderPane pane = new BorderPane();
    pane.setBottom(paneForButtons);
    
    Pane paneForText = new Pane();
    paneForText.getChildren().add(text);
    pane.setCenter(paneForText);
    
    btLeft.setOnAction(e -> text.setX(text.getX() - 10));
    btRight.setOnAction(e -> text.setX(text.getX() + 10));

    return pane;
  }
   
  public static void main(String[] args) {
    launch(args);
  }
}

class dddd{}
