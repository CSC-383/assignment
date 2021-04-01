

package javafxex;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class button extends Application {
  
    
    public void start(Stage s)
    {        
        s.setTitle("creating buttons");
  
         Button b = new Button("button");
  
         StackPane r = new StackPane();
  
         r.getChildren().add(b);
  
         Scene sc = new Scene(r, 500, 500);
  
        s.setScene(sc);
  
        s.show();
    }
  
    public static void main(String args[])
    {
         launch(args);
    }
}
