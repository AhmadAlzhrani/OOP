package Lecture19;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowFlags extends Application{
    
    ImageView imageView;
    
     @Override
    public void start(Stage primaryStage) {
        StackPane  stackPane= new StackPane();
         
         
        final String[] names = 
                new String[]{"windows", "linux", "Mac"};
        
        HBox  hbox= new HBox(5);
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10,10,10,10));
        
        for (int i = 0; i < names.length; i++) {
            Button  button =  new Button (names[i]);
            //button.setDisable(true);
            button.setPrefWidth(100);
            hbox.getChildren().add(button);
            button.setOnAction(new ButtonHandler());
        }
        
        
        imageView =  new ImageView();
        imageView.setFitHeight(60); imageView.setFitWidth(60);
        stackPane.getChildren().add(imageView);  

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hbox);
        borderPane.setCenter(stackPane);
      
        Scene scene = new Scene(borderPane, 450, 100);
        primaryStage.setScene(scene); 
        
        primaryStage.setTitle("Flag Demo"); 
        primaryStage.show(); 
    }
  
  class ButtonHandler 
          implements EventHandler<ActionEvent> {
    
    @Override
    public void handle(ActionEvent e) {
        
        String id = (  (Button) e.getSource()).getText();
        Image image = new Image("lec19/"+ id+ ".png");
        imageView.setImage(image);  
  }
}
 
public static void main(String[] args) {
    launch(args);
  }

}
