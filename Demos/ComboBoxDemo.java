
package Lecture22;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ComboBoxDemo extends Application {
  // Declare an array of Strings for flag titles
  private String[] flagTitles = {"Canada", "China", "Denmark", 
    "France", "Germany", "India", "Norway", "United Kingdom",
    "United States of America"};
  
  // Declare an array of strings for flag descriptions
  private String[] flagDescription = new String[9];
  // Declare and create a description pane
  private DescriptionPane descriptionPane = new DescriptionPane();
  // Create a combo box for selecting countries
  private ComboBox<String> cbo = new ComboBox<>(); // flagTitles

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Set text description
    flagDescription[0] = "The Canadian national flag ...";
    flagDescription[1] = "Description for China ... ";
    flagDescription[2] = "Description for Denmark ... ";
    flagDescription[3] = "Description for France ... ";
    flagDescription[4] = "Description for Germany ... ";
    flagDescription[5] = "Description for India ... ";
    flagDescription[6] = "Description for Norway ... ";
    flagDescription[7] = "Description for UK ... ";
    flagDescription[8] = "Description for US ... ";
    // Set the first country (Canada) for display
    setDisplay(0);
  
    BorderPane pane = new BorderPane();
    BorderPane paneForComboBox = new BorderPane();
    paneForComboBox.setLeft(new Label("Select a country: "));
    paneForComboBox.setCenter(cbo);
    pane.setTop(paneForComboBox);
    cbo.setPrefWidth(400);
    cbo.setValue("Canada");
    
    ObservableList<String> items = 
      FXCollections.observableArrayList(flagTitles);
    cbo.getItems().addAll(items); 
    pane.setCenter(descriptionPane);

    cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));

    Scene scene = new Scene(pane, 450, 170);
    primaryStage.setTitle("ComboBoxDemo"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

 
  public void setDisplay(int index) {
    descriptionPane.setTitle(flagTitles[index]);
    descriptionPane.setImageView(new ImageView(
            new Image("lec18/"+ flagTitles[index]+ ".gif"))
    ); 
    descriptionPane.setDescription(flagDescription[index]);
  }

  public static void main(String[] args) {
    launch(args);
  }
}