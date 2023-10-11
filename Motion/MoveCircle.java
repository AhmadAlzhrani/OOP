
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
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveCircle extends Application {
  private final CirclePane1 circlePane = new CirclePane1();
  @Override 
  public void start(Stage primaryStage) {
    HBox hBox = new HBox(10);
    hBox.setPadding(new Insets(5,5,5,5));
    hBox.setAlignment(Pos.CENTER);
    
    Button btUP = new Button("UP");
    btUP.setId("UP");
    
    Button btDwon = new Button("Down");
    btDwon.setId("Down");
    
    Button btRight = new Button("Right");
    btRight.setId("Right");
    
    Button btLeft = new Button("Left");
    btLeft.setId("Left");
     
    hBox.getChildren().addAll(btUP,btDwon,btRight,btLeft);
    
    btUP.setOnAction(new MoveCircleHandler());
    btDwon.setOnAction(new MoveCircleHandler());
    btRight.setOnAction(new MoveCircleHandler());
    btLeft.setOnAction(new MoveCircleHandler());

    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);

    Scene scene = new Scene(borderPane, 200, 150);
    primaryStage.setTitle("MoveCircle"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  
  class MoveCircleHandler 
          implements EventHandler<ActionEvent> {
    @Override // Override the handle method
    public void handle(ActionEvent e) {
       
        switch (( (Button) e.getSource()).getId()) {
            case "UP":
                circlePane.up();    break;
            case "Down":
                circlePane.down();  break;
            case "Right":
                circlePane.right(); break;
            case "Left":
                circlePane.left();  break;
            default:
                break;
        }
    }
  }
  
 
  public static void main(String[] args) {
    launch(args);
  }
}

class CirclePane1 extends Pane {
  private final Circle circle = new Circle(50); 
  
  public CirclePane1() {
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
  }
  
  public void up() {
    circle.setCenterY(circle.getCenterY() - 10);
  }
  
  public void down() {
     circle.setCenterY(circle.getCenterY() + 10);
  }
  
  public void right() {
     circle.setCenterX(circle.getCenterX() + 10);
  }
  
  public void left() {
     circle.setCenterX(circle.getCenterX() - 10);
  }
}