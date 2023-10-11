import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.layout.*;
public class javaFX extends Application {
	public void start(Stage primaryStage) {
	    // Create a button and place it in the scene
	    //Button btOK = new Button("OK");
	    //Scene scene = new Scene(btOK, 200, 250);
	    
	    Image []pics = {new Image("https://img.cloudygif.com/small/7c43a7fa36760ebf.gif"),
	    				new Image("https://i.pinimg.com/originals/3b/8a/d2/3b8ad2c7b1be2caf24321c852103598a.jpg"),
	    				new Image("https://wallpapercave.com/wp/wp3850825.jpg")};
	    Pane pane = new HBox(10);
	    ImageView []list = new ImageView [pics.length];
	    for (int i = 0; i<pics.length; i++) {
	    	list[i] = new ImageView(pics[i]);
	    	list[i].setFitHeight(list[i].getScaleX()*300);
	    	list[i].setFitWidth(list[i].getScaleY()*500);
	    }
	    pane.getChildren().add(list[(int)(Math.random()*3)]);
		//pane.getChildren().add(new ImageView(pics[(int)(Math.random()*3)]));
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("MyJavaFX"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	    				
	  }
	
	public static void main(String[] args) {
		launch(args);

	}

}

