package Lecture19;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//from   w  ww.jav  a 2 s. c  o  m
public class StyledVBox extends Application {
    private Label msgLbl = new Label("FXML is coll!");
    private Button sayHelloBtn = new Button("Say Hello");
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        msgLbl.setPrefWidth(150);
        
        sayHelloBtn.setOnAction(this::sayHello);

        VBox root = new VBox(10);
        root.getChildren().addAll(msgLbl, sayHelloBtn);
        root.setStyle("-fx-padding: 10;" + 
                      "-fx-border-style: solid inside;" + 
                      "-fx-border-width: 2;" +
                      "-fx-border-insets: 5;" + 
                      "-fx-border-radius: 5;" + 
                      "-fx-border-color: blue;");
        
    
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Hello FXML");
        stage.show();       
    }
    
    public void sayHello(ActionEvent e) {
        msgLbl.setText("Hello from FXML!");
    }
}