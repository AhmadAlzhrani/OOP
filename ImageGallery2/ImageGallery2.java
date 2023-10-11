package lab21;
import javafx.animation.Timeline;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.*;
import javafx.geometry.Insets;

public class lab21 extends Application {
	int i=1;
	ImageView pic1st;
	Image []pics = {new Image("https://img.cloudygif.com/small/7c43a7fa36760ebf.gif"),
			new Image("https://i.pinimg.com/originals/3b/8a/d2/3b8ad2c7b1be2caf24321c852103598a.jpg"),
			new Image("https://wallpapercave.com/wp/wp3850825.jpg")};
	StackPane sp = new StackPane();
	
	public void start(Stage primaryStage) {
		 EventHandler<ActionEvent> eventHandler = e -> {
		    	if(!(pic1st.getImage().getUrl().equals(pics[(pics.length-1)].getUrl()))) {
	    			i++;
	    			pic1st.setImage(pics[i]);}
		      };
		Timeline animation = new Timeline(new KeyFrame( Duration.millis(2000),eventHandler ));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	    HBox box = new HBox(5);
	    box.setAlignment(Pos.CENTER);
	    box.setPadding(new Insets(10,10,10,10));
	    String []names = {"pause"};
	    for (int i = 0;i<names.length;i++) {
	    	Button b1 = new Button(names[i]);
	    	b1.setPrefWidth(100);
	    	box.getChildren().add(b1);
	    	b1.setOnAction( e -> {
		    	  if( animation.getStatus() == Animation.Status.PAUSED) {animation.play();b1.setText("pause");}
			    	else {animation.pause();b1.setText("play");}
			      });
	    }	
	    pic1st = new ImageView(pics[1]);
	    pic1st.setFitHeight(100);pic1st.setFitWidth(100);
	    sp.getChildren().add(pic1st);
	    BorderPane bp = new BorderPane();
	    bp.setBottom(box);
	    bp.setCenter(sp);
	   
	    
	    Scene scene = new Scene(bp,400,200);
	    primaryStage.setTitle("MyJavaFX"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	  }

	public static void main(String[] args) {
		launch(args);
	}

	
}
