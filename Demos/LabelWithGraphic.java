
package Lecture22;
import com.sun.javafx.geom.Shape;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class LabelWithGraphic extends Application {
  @Override 
  public void start(Stage primaryStage) throws FileNotFoundException {
     
    Image myImage = new Image("lec18/us.gif");
    ImageView us  = new ImageView(myImage);
    
    Label lb1 = new Label();
    lb1.setText("US\n50 states");
    lb1.setGraphic(us);
    lb1.setStyle("-fx-border-color: green; -fx-border-width: 2");
    lb1.setTextFill(Color.RED);
    lb1.setGraphicTextGap(10);
    lb1.setContentDisplay(ContentDisplay.BOTTOM);
    lb1.setTextAlignment(TextAlignment.CENTER);
    lb1.setUnderline(true);
    Label lb2 = new Label("Circle", new Circle(50, 50, 25));
    lb2.setContentDisplay(ContentDisplay.TOP);
    lb2.setTextFill(Color.ORANGE);
    
    Label lb3 = new Label("Rectangle", new Rectangle(10, 10, 50, 25));
    lb3.setContentDisplay(ContentDisplay.RIGHT);
    
    Label lb4 = new Label("Ellipse", new Ellipse(50, 50, 25, 50));
    lb4.setContentDisplay(ContentDisplay.LEFT);
     
    Ellipse ellipse = new Ellipse(50, 50, 50, 25);
    ellipse.setStroke(Color.GREEN);
    ellipse.setFill(Color.WHITE);
    StackPane stackPane = new StackPane();
    stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
    Label lb5 = new Label("A pane inside a label");
    lb5.setGraphic(stackPane);
    lb5.setContentDisplay(ContentDisplay.BOTTOM);
    lb5.setTextFill(Color.web("#1176b3"));
    
    Label lb6 = new Label("ICS108 Object Oriented Programming");
    lb6.setRotate(45);
    lb6.setTranslateX(10);
    lb6.setWrapText(true);
    lb6.setFont(new Font("Arial", 10));
    HBox pane = new HBox(20);
    pane.setPadding(new Insets(10,10,10,10));
    pane.getChildren().addAll(lb1, lb2, lb3, lb4, lb5,lb6);
    pane.setAlignment(Pos.CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 750, 150);
    primaryStage.setTitle("LabelWithGraphic"); 
    primaryStage.setScene(scene); 
    primaryStage.show();
  }

 
  public static void main(String[] args) {
    launch(args);
  }
}