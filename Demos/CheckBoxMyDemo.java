
package Lecture22;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxMyDemo extends Application {
  HBox  hbox= new HBox(10);
  VBox  vbox= new VBox(5); 
  ImageView imageView ;
  @Override 
  public void start(Stage primaryStage) {
    BorderPane pane = getPane();
    Scene scene = new Scene(pane, 450, 100);
    primaryStage.setTitle("ButtonDemo"); 
    primaryStage.setScene(scene); 
    primaryStage.show(); 

  }
  protected BorderPane getPane() {
    final String[] names = new String[]{"windows", "linux", "mac"};
    BorderPane pane = new BorderPane();
    vbox.setPadding(new Insets(10,10,10,10));
    hbox.setAlignment(Pos.CENTER);
    for (int i = 0; i < names.length; i++) {
        CheckBox cb =  new CheckBox(names[i]);
        cb.setId(names[i]);
        vbox.getChildren().add(cb);
        setCheckBoxAction(cb);
    }
    pane.setLeft(vbox);
    BorderPane.setAlignment(vbox, Pos.CENTER);
    pane.setCenter(hbox);
    BorderPane.setAlignment(vbox, Pos.CENTER);
    return pane;
  }
  
  private void setCheckBoxAction(CheckBox cb){
      
      cb.setOnAction(e->{
        CheckBox chb = ((CheckBox) e.getSource());
        if ( chb.isSelected() )  
            getImage(chb.getId());
        else{
            hbox.getChildren().removeIf(
                    n->n.getId().equals(chb.getId()));
           
        }
        });  
  }
  
  private void setCheckBoxListener(CheckBox cb){
      
    cb.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> ov,
                Boolean old_val, Boolean new_val) {
                    if (new_val )
                        getImage(cb.getId());
                    else {
                       
                        hbox.getChildren().removeIf(n->n.getId().equals(cb.getId()));
                    }
                }
      });  
  }
  
  private void getImage(String id){
    Image image = new Image("lec19/"+ id+ ".png");
    imageView =  new ImageView(image);
    imageView.setFitHeight(60); imageView.setFitWidth(60);
    imageView.setId(id);
    hbox.getChildren().add(imageView);
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

