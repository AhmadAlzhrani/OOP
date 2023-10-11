
package Lecture22;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class ListViewDemo extends Application {
  // Declare an array of Strings for flag titles
  private String[] flagTitles = {"Canada", "China", "Denmark", 
    "France", "Germany", "India", "Norway", "United Kingdom",
    "United States of America"};
  
  @Override 
  public void start(Stage primaryStage) {
    ListView<String> lv = new ListView<>
      (FXCollections.observableArrayList(flagTitles));
    lv.setPrefSize(140, 400);
    lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    
    // Create a pane to hold image views
    FlowPane imagePane = new FlowPane(10, 10);
    BorderPane pane = new BorderPane();
    pane.setLeft(new ScrollPane(lv));   
    pane.setCenter(imagePane);
    
   lv.getSelectionModel().selectedItemProperty().addListener(
    new ChangeListener<String>() {
        public void changed(ObservableValue<? extends String> ov, 
            String old_val, String new_val) {
            imagePane.getChildren().clear();
            for (Integer i: lv.getSelectionModel().getSelectedIndices()) {
              imagePane.getChildren().add(
              new ImageView ( new Image("lec18/"+ flagTitles[i]+ ".gif")
              ));
            }  
            System.out.println(ov.toString());
        }
    });
    
    Scene scene = new Scene(pane, 450, 170);
    primaryStage.setTitle("ListViewDemo"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
}