package Lecture22;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ComboBoxMyDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        ComboBox cbo = new ComboBox<>(); 
        
        cbo.getItems().addAll("Computer Engineering","Computer Science",
        "Systems Engineering","Aerospace Engineering","Chemical Engineering",
        "Civil & Environmental Engineering","Electrical Engineering",
        "Mechanical Engineering");
       
        cbo.setValue("Computer Science");
        String value = (String) cbo.getValue();
        cbo.setVisibleRowCount(3);
       
        System.out.println(value);
        pane.setCenter(cbo);
        Scene scene = new Scene(pane, 450, 100);
        primaryStage.setTitle("ButtonDemo"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
    }
    public static void main(String[] args) {
        launch(args);
    }

}
