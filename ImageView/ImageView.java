package lab19;
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
import javafx.scene.image.*;
import javafx.geometry.Insets;

public class lab19 extends Application {
	int i=1;
	ImageView pic1st;
	Image []pics = {new Image("https://img.cloudygif.com/small/7c43a7fa36760ebf.gif"),
			new Image("https://i.pinimg.com/originals/3b/8a/d2/3b8ad2c7b1be2caf24321c852103598a.jpg"),
			new Image("https://wallpapercave.com/wp/wp3850825.jpg")};
	StackPane sp = new StackPane();
	
	public void start(Stage primaryStage) {
	    HBox box = new HBox(5);
	    box.setAlignment(Pos.CENTER);
	    box.setPadding(new Insets(10,10,10,10));
	    String []names = {"previous","next"};
	    for (int i = 0;i<2;i++) {
	    	Button b1 = new Button(names[i]);
	    	b1.setPrefWidth(100);
	    	box.getChildren().add(b1);
	    	b1.setOnAction(new ButtonHandler());
	    }	
	    pic1st = new ImageView(pics[1]);
	    pic1st.setFitHeight(100);pic1st.setFitWidth(100);
	    sp.getChildren().add(pic1st);
	    BorderPane bp = new BorderPane();
	    bp.setBottom(box);
	    bp.setCenter(sp);

	    Scene scene = new Scene(bp,450,100);
	    primaryStage.setTitle("MyJavaFX"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	  }

	public static void main(String[] args) {
		launch(args);
	}

	class ButtonHandler implements EventHandler<ActionEvent> {
		
	    public void handle(ActionEvent e) {
	    	String id = ( (Button) e.getSource()).getText();
	    	System.out.println((Button)e.getSource());
	    	
	    	if("next".equals(id)){
	    		if(!(pic1st.getImage().getUrl().equals(pics[(pics.length-1)].getUrl()))) {
	    			i++;
	    			pic1st.setImage(pics[i]);}
	    	}
	    	else {
	    		if(!(pic1st.getImage().getUrl().equals(pics[0].getUrl()))) {
	    			i--;
	    			pic1st.setImage(pics[i]);}
	    	}
	    }
	}
}
