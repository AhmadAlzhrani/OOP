import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Project extends Application{
	//Declaring global variables.
	
	//Declaring three arrays to hold questions, answers and questions combo box.
	ArrayList<Mcq> questionsArray = new ArrayList<Mcq>();
	ComboBox<String> questionsComboBox = new ComboBox<String>();
	
	Stage window;				//Declaring a stage.
	Scene scene1,scene2,scene3;	//Declaring the scenes
	TextField answer1,answer2,answer3,answer4,newQuestion; //Declaring the text fields.
	HBox scene2Question;
	Save binary;
	int indexOfMcq;
	
	public void start(Stage primaryStage) throws Exception  {
		window = primaryStage; //Initializing "window" to be our primary stage.
		//---------------------------------------------------------------------------------------
		binary = new Save("QuestionBank.dat");	//Making a "Save" class object and passing our file to save changes.
		try{
			binary.read();
			if (binary.Qs == null) {}
			else {	
				questionsArray.addAll(binary.Qs);
				}
		}
		catch(Exception e) {}
		//---------------------------------------------------------------------------------------//scene 1 buttons 
		
		Button addQuestion = new Button("Add Question"); 	//Declaring the button which the user will use in order to add a question.	
		addQuestion.setOnAction(new ButtonHandler());
		Button save = new Button("Save & Exit");               // the save and exit button
		save.setOnAction(new ButtonHandler());           
	    save.setMinSize(90, 20);
	    
		VBox controls = new VBox(10);
		controls.getChildren().addAll(addQuestion,save);
		controls.setAlignment(Pos.CENTER);
		
		for(Mcq a: questionsArray)                                          //adding the content of the question array to the combo box
			questionsComboBox.getItems().addAll(a.toString());
		questionsComboBox.setMinSize(500, 20);
		questionsComboBox.setValue("Choose question:");
		
		HBox select = new HBox(30);
		select.getChildren().addAll(new Label("Choose question: "),questionsComboBox);
		
		BorderPane pane1 = new BorderPane();					// adjust the border pane
		pane1.setRight(controls);								
		pane1.setTop(select);									
		pane1.setPadding(new Insets(10,10,10,10));
		
		//---------------------------------------------------------------------------------------//scene 2 buttons
		
		Button removeQ = new Button("Remove question");
		removeQ.setOnAction(new ButtonHandler());                           // adding the remove and edit and return button in the 2nd scene
		Button editQ = new Button("Edit question");
		editQ.setOnAction(new ButtonHandler());
		editQ.setMinSize(110, 20);
		Button return1 = new Button("Return");
		return1.setOnAction(new ButtonHandler());
		return1.setMinSize(110, 20);
		ArrayList<RadioButton> rList = new ArrayList<RadioButton>();             // putting the radio buttons in array list to to ease the sorting
		ToggleGroup Tgroup = new ToggleGroup();
		HBox scene2Question = new HBox(10);
		VBox viewQ = new VBox(20);	
		for(int i =0;i<4;i++)
			rList.add(new RadioButton(""));
		viewQ.getChildren().add(scene2Question);
		for(RadioButton s: rList) {												// put the radio buttons in the toggle group
			s.setToggleGroup(Tgroup);											// radio buttons adjusted to be the multiple answers
			s.setOnAction(new RadioButtonHandler());
			viewQ.getChildren().add(s);
		}
		
		
		VBox num0 = new VBox(20);
		num0.getChildren().addAll(editQ,removeQ,return1);
		BorderPane pane2 = new BorderPane();
		pane2.setPadding(new Insets(10,10,10,10));
		pane2.setRight(num0);
		pane2.setLeft(viewQ);
		
		//---------------------------------------------------------------------------------------//scene 3 buttons
		
		newQuestion = new TextField("");	//
		newQuestion.setMinSize(300, 20);	//
		answer1 = new TextField("");		//
		answer1.setMinSize(200, 20);		//
		answer2 = new TextField("");		//	This code sets up empty text fields for the user to write his
		answer2.setMinSize(200, 20);		//	question and answers however he desire.
		answer3 = new TextField("");		//
		answer3.setMinSize(200, 20);		//
		answer4 = new TextField("");		//
		answer4.setMinSize(200, 20);		//
		
		
		Button submit = new Button("Submit");
		submit.setOnAction(new ButtonHandler());
		
		HBox speQ = new HBox(18);
		speQ.setPadding(new Insets(10,10,10,10));
		speQ.getChildren().addAll(new Label("The question: "),newQuestion);             // setting the text fields 
		HBox an1 = new HBox(20);
		an1.getChildren().addAll(new Label("Right answer:    "),answer1);
		HBox an2 = new HBox(20);
		an2.getChildren().addAll(new Label("Wrong answer: "),answer2);
		HBox an3 = new HBox(20);
		an3.getChildren().addAll(new Label("Wrong answer: "),answer3);
		HBox an4 = new HBox(20);
		an4.getChildren().addAll(new Label("Wrong answer: "),answer4);
		VBox adding = new VBox(30);
		adding.getChildren().addAll(speQ,an1,an2,an3,an4,submit);						//add the field to the border pane
		BorderPane pane3 = new BorderPane();
		pane3.setPadding(new Insets(100,10,10,150));
		pane3.setCenter(adding);
		
		//----------------------------------------------------------------------------------------// combo box handler
		
		questionsComboBox.setOnAction(e ->{
			if(questionsComboBox.getValue() == null || questionsComboBox.getValue().equals("Choose question:")) { 
				e.consume();																	// be sure that the combo box is used with valid value
			}
			else {
				for(int i =0;i<4;i++)
					rList.get(i).setSelected(false);
				
				primaryStage.setScene(scene2);          // change scene to view the question
				
				if(scene2Question.getChildren().size() == 0) {}else{ scene2Question.getChildren().remove(0);}
				scene2Question.getChildren().add(new Text(questionsComboBox.getValue()));
				ArrayList<String> a = new ArrayList<String>();								//temporary array to randomize the questions 
				
				for (Mcq x : questionsArray ) {
				    if (questionsComboBox.getValue().equals(x.toString() )) {				// searching for the index of the object in the combo box
				        indexOfMcq = questionsArray.indexOf(x);
				        break ;
				    }
				}
				a.add(questionsArray.get(indexOfMcq).getRightAnswer());                       // adding the answers to the temporary array
				a.add(questionsArray.get(indexOfMcq).getWrongAnswer1());
				a.add(questionsArray.get(indexOfMcq).getWrongAnswer2());
				a.add(questionsArray.get(indexOfMcq).getWrongAnswer3());
				
				String a1 = a.get((int)(Math.random()*4));a.remove(a1);						// choose the answers randomly for the question
				String a2 = a.get((int)(Math.random()*3));a.remove(a2);
				String a3 = a.get((int)(Math.random()*2));a.remove(a3);
				rList.get(0).setText(a1);rList.get(1).setText(a2);rList.get(2).setText(a3);rList.get(3).setText(a.get(0));
			}
		});
	   
	    window.setOnCloseRequest(e ->{
	    	ChoiceBox.display("Please save before leaving",new Image("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Circle-icons-caution.svg/1200px-Circle-icons-caution.svg.png"));
	    	e.consume();
	    });															// handler to prevent closing the window while using the application
	    
		//----------------------------------------------------------------------------------------
																	//
		scene3 = new Scene(pane3,800,500);							//	This code sets up the style and look of our stage and scenes, 
		scene2 = new Scene(pane2,800,500);							//	such as stage the title, scene dimensions and stage icon.
	    scene1 = new Scene(pane1,800,500);							//	then shows our primary stage when the application is launched.
	    window.setTitle("MyJavaFX");								//
	    Image appIcon = new Image("https://upload.wikimedia.org"	//
	    + "/wikipedia/commons/thumb/5/50/Closed_Book_Icon.svg"  	//
	    + "/512px-Closed_Book_Icon.svg.png");						//
		window.getIcons().add(appIcon);								//
	    window.setScene(scene1);									//
	    window.show();												//
	}
	
	public static void main(String[] args) {
		launch(args);	//Launches the program.
	}
	class ButtonHandler implements EventHandler<ActionEvent> {
			
		public void handle(ActionEvent e) {
			ArrayList<TextField> a = new ArrayList<TextField>();a.add(answer1);a.add(answer2);a.add(answer3);a.add(answer4);
			String id = ( (Button) e.getSource()).getText();
		    if(id.equals("Add Question")) {
		    	window.setScene(scene3);
		    }
		    else if (id.equals("Submit")) {	                                 // After the "Submit" button is pressed, the question and all answers
		    	questionsArray.add(new Mcq( newQuestion.getText(),a.get(0).getText(),a.get(1).getText(),a.get(2).getText(),a.get(3).getText()));					
		    	for(TextField s:a) 											// After the "Submit" button is pressed, the question and all answers
		    		s.clear();												// are saved inside an array, then all text fields are cleared
		    																// so the user can add another question.
		    	if(questionsComboBox.getItems().size() != 0)	{											// checking the conditions before removing the element
			    	if(newQuestion.getText().equals(questionsArray.get(indexOfMcq).toString())) {
			    		questionsArray.remove(indexOfMcq);
			    		questionsComboBox.getItems().remove(indexOfMcq);
			    		
			    	}
		    	}
				questionsComboBox.getItems().add(questionsArray.get(questionsArray.size()-1).toString());		// add the edited question to the combo box
				newQuestion.clear();										
				
				window.setScene(scene1);	// Switches back to the main scene
		    }
		    else if (id.equals("Return")) {
		    	window.setScene(scene1);
				questionsComboBox.setValue("Choose question:");
		    }
		    else if(id.equals("Edit question")) {									// handling the transmission to the 3rd scene
		    	window.setScene(scene3);
				newQuestion.setText(questionsArray.get(indexOfMcq).toString());                // set the chosen question to be edited
				answer1.setText(questionsArray.get(indexOfMcq).getRightAnswer());
				answer2.setText(questionsArray.get(indexOfMcq).getWrongAnswer1());
				answer3.setText(questionsArray.get(indexOfMcq).getWrongAnswer2());
				answer4.setText(questionsArray.get(indexOfMcq).getWrongAnswer3());
				
				questionsComboBox.setValue("Choose question:");
		    }
		    else if(id.equals("Remove question")) {
		    	window.setScene(scene1);											// removing question from the array and the combo box
		    	
				String temp = questionsComboBox.getValue();							// temporary string to hold the value and remove it after the change
				questionsArray.remove(indexOfMcq);
				questionsComboBox.setValue("Choose question:");
				questionsComboBox.getItems().remove(temp);
		    }
		    else if(id.equals("Save & Exit")) {      								// saving the data using the class Save and method write
		    	try {
					binary.write(questionsArray,questionsArray.size());
					window.close();
				} 
		    	catch (Exception e1) {
					e1.printStackTrace();
				}
		    }
		    else {}
		}
	}
	class RadioButtonHandler implements EventHandler<ActionEvent> {
		
		public void handle(ActionEvent e) {
			String id = ( (RadioButton) e.getSource()).getText();					// event handler for the radio buttons and to notify if the answer right or wrong 
			if (((RadioButton) e.getSource()).isSelected()) {
				if(id.equals(questionsArray.get(indexOfMcq).getRightAnswer()))
					ChoiceBox.display("YOUR ANSWER IS RIGHT", new Image("https://image.similarpng.com/very-thumbnail/2020/09/Right-mark-icon-on-transparent-background-PNG.png"));
				else
					ChoiceBox.display("YOUR ANSWER IS WRONG",new Image("https://cdn3.iconfinder.com/data/icons/shadcon/512/circle_-_corss-512.png"));
		    	  questionsComboBox.setValue(null);
		    	  window.setScene(scene1);
			}
		}
	}
}

