import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.*;

//The idea behind this class is to reveal the result of an answer,
//Or to notify the user of unsaved changes to the questions bank.
// it is just a basic choice box in simple manner

public class ChoiceBox {
	public static void display(String notification, Image image) {
		
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL); //set the type of the window 
		window.setMinWidth(300);
		
		
		HBox box = new HBox(10);
		box.getChildren().add(new Label(notification)); //Displaying the given string to the user.
		box.setAlignment(Pos.CENTER);
		
		//The code below sets up the stage and scene style and dimensions.
		Scene scene = new Scene(box,300,300);
		window.setScene(scene);
		window.setTitle("Notification");
		window.getIcons().add(image);
		window.showAndWait();
	}

}
