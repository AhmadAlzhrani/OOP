package lab22;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.geometry.*;

public class lab22 extends Application {
	
	ComboBox<String> fontComb = new ComboBox<>(); 
	ComboBox<String> sizeComb = new ComboBox<>(); 
	Text text = new Text(50, 50, "Programming is Fun");
	String weight;
	String style;
	String font;
	int size;
	
	public void start(Stage primaryStage) {
		CheckBox bold = new CheckBox("Bold");
		CheckBox italic = new CheckBox("Italic");
		
		List<String>fonts = Font.getFontNames();
		String [] sizes = new String[100];
		for(int i=0;i<100;i++)
			sizes[i] = String.valueOf(i+1);
		
		HBox combo = new HBox(10);
		combo.getChildren().addAll(new Label("select font : "),fontComb,new Label("select size: "),sizeComb);
		sizeComb.setPrefWidth(100);
		sizeComb.setValue("10");
		fontComb.setPrefWidth(200);
		fontComb.setValue("Arial");
		
		HBox check = new HBox(10);
		check.getChildren().addAll(bold,italic);
		check.setAlignment(Pos.CENTER);
		
		BorderPane pane = new BorderPane();
		pane.setBottom(check);
		pane.setTop(combo);
		pane.setCenter(text);
		
		text.setStyle(String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
								,font,size,weight,style));
		
		ObservableList<String> items1 = FXCollections.observableArrayList(fonts);
		fontComb.getItems().addAll(items1);
		
		ObservableList<String> items2 = FXCollections.observableArrayList(sizes);
		sizeComb.getItems().addAll(items2);
		
		bold.setOnAction(e -> {
			if (bold.isSelected()) 
				{weight = "bold";text.setStyle(
						String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
								,font,size,weight,style));}
		    else
		    	{weight = "normal";text.setStyle(
		    			String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
		    					,font,size,weight,style));}
		});
		 italic.setOnAction( e -> {
			if (italic.isSelected())
		    	{style = "italic";text.setStyle(
		    			String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
		    					,font,size,weight,style));}
		    else
		    	{style = "normal";text.setStyle(
		    			String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
		    					,font,size,weight,style));}
		});
		 fontComb.setOnAction(e -> {font = fonts.get( items1.indexOf(fontComb.getValue()));text.setStyle(
	    			String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
	    					,font,size,weight,style));});
		 
		 sizeComb.setOnAction(e -> {size = Integer.parseInt(sizes[items2.indexOf(sizeComb.getValue())]);text.setStyle(
	    			String.format("-fx-font-family: %s; -fx-font-size: %d;-fx-font-weight: %s ; -fx-font-style: %s ;"
	    					,font,size,weight,style));});
		    	  
	    Scene scene = new Scene(pane,500,200);
	    primaryStage.setTitle("MyJavaFX"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show();			
	  }
	public static void main(String[] args) {
		launch(args);
	}
}
