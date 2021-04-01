
package javafxex;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class hbox extends Application  {


  public void start(Stage primaryStage) throws Exception { 
    primaryStage.setTitle("Hbox Experiment");

    Button button1 = new Button("Button 1");
    Button button2 = new Button("Button 2");

    HBox hbox = new HBox(button1, button2);

    Scene scene = new Scene(hbox, 400, 400);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}