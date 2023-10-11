package Lecture22;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class RadioButtonMyDemo extends Application{
    ToggleGroup group = new ToggleGroup();
    ImageView imageView = new ImageView();
    HBox  hbox= new HBox(10);
     @Override
    public void start(Stage primaryStage) {
    BorderPane pane = getPane();
    Scene scene = new Scene(pane, 450, 100);
    primaryStage.setTitle("Radio Button Demo"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }
  protected BorderPane getPane() {
    final String[] names = new String[]{"windows", "linux", "mac"};
    BorderPane pane = new BorderPane();
    VBox  vbox= new VBox(5);
    vbox.setPadding(new Insets(10,10,10,10));
    hbox.setAlignment(Pos.CENTER);
        for (String name : names) {
            RadioButton rdButton = new RadioButton(name);
            rdButton.setToggleGroup(group);
            rdButton.setUserData(name);
            vbox.getChildren().add(rdButton);
            //setRadioButtonAction(rdButton);
            setRadioButtonListener(rdButton);
        }

    pane.setLeft(vbox);
    BorderPane.setAlignment(vbox, Pos.CENTER);
    
    imageView.setFitWidth(60);
    imageView.setFitHeight(60);
    hbox.getChildren().add(imageView);
   
    pane.setCenter(hbox);
    BorderPane.setAlignment(vbox, Pos.CENTER);
    return pane;
  }
  
  private void setRadioButtonAction(RadioButton rButtonSystem){
 
        rButtonSystem.setOnAction(e->{
        RadioButton chb = ((RadioButton) e.getSource());
        if ( chb.isSelected() )  
            getImage(chb.getUserData().toString());

        });  
  }
  
  private void setRadioButtonListener(
          RadioButton rButtonSystem){
          rButtonSystem.selectedProperty().addListener(
            new ChangeListener<Boolean>(){
            @Override
            public void changed(ObservableValue ov,
                Boolean old_val, Boolean new_val) {
                if (new_val){
                    getImage(group.getSelectedToggle().getUserData().toString()); 
                }
                  
                }
      });  
  }
  
  private void setRadioGroupListener(){
          group.selectedToggleProperty().addListener(
                  new ChangeListener<Toggle>() {
    @Override
    public void changed(ObservableValue<? extends Toggle> observable, 
                                Toggle oldValue, Toggle newValue) {
      if (group.getSelectedToggle() != null) {
        System.out.println(group.getSelectedToggle().getUserData().toString());
        hbox.getChildren().remove(imageView);
        getImage(group.getSelectedToggle().getUserData().toString());         
      }
    }
      });  
  }
 
  
 private void getImage(String id){
    Image image = new Image("lec18/"+ id+ ".png");
    imageView.setImage(image);
  }
 
 
 private void showCheckBoxState(Pane pane){
    Object obj = pane.getChildrenUnmodifiable().toArray()[0];
    Object obj1[] = ( (Pane) obj).getChildrenUnmodifiable().toArray();
    for(Object node: obj1 ){
        System.out.println( ((CheckBox) node).isIndeterminate() + " : "  +
        ((CheckBox) node).isSelected());
    }
  }
 
 
public static void main(String[] args) {
    launch(args);
  }

}
