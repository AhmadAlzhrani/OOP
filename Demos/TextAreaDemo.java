
package Lecture22;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TextAreaDemo extends Application {
  @Override 
  public void start(Stage primaryStage) {
    
    DescriptionPane descriptionPane = new DescriptionPane();
    descriptionPane.setTitle("Canada");
    String description = "The Canadian national flag ...";
    Image image = new Image("lec18/ca.gif");
    descriptionPane.setImageView(new ImageView(image));
    descriptionPane.setDescription(description);
   
    Scene scene = new Scene(descriptionPane, 450, 200);
    primaryStage.setTitle("TextAreaDemo"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
}