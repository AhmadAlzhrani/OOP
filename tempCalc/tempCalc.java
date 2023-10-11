package labTest;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class labTest extends Application {
	public void start(Stage primaryStage) {
		Button CtoF = new Button("Celsius to Fahrenheit");
		Button FtoC = new Button("Fahrenheit to Celsius");
		TextField textCtoF = new TextField();
		TextField textFtoC = new TextField();
		textCtoF.setPromptText("Celsius to Fahrenheit");
		textFtoC.setPromptText("Fahrenheit to Celsius");
		HBox boxCtoF = new HBox (10);
		boxCtoF.getChildren().addAll(CtoF,textCtoF);
		HBox boxFtoC = new HBox (10);
		boxFtoC.getChildren().addAll(FtoC,textFtoC);
		VBox text = new VBox(20);
		text.getChildren().addAll(boxCtoF,boxFtoC);
		text.setAlignment(Pos.CENTER);
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(10,10,10,10));
		pane.setCenter(text);
		
		CtoF.setOnAction(e ->{
			textFtoC.setText(null);
			String a = textCtoF.getText();
			double result = toF(Double.valueOf(a));
			textFtoC.setText(String.format("%f",result) );
		});
		FtoC.setOnAction(e ->{
			textCtoF.setText(null);
			String a = textFtoC.getText();
			double result = toC(Double.parseDouble(a));
			textCtoF.setText(String.format("%f",result) );
		});
		
		
		
	    Scene scene = new Scene(pane,500,100);
	    primaryStage.setTitle("MyJavaFX"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	    				
	  }
	
	public static void main(String[] args) {
		launch(args);

	}
	public double toF(double c) {
		return((1.8*c)+32);
	}
	public double toC(double f) {
		return((5*(f-32))/9);
	}

}