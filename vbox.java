package javafxex;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class vbox extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("VBox Experiment");

        Button button1 = new Button(" VBox Button 1");
        Button button2 = new Button(" VBox Button 2");

        VBox vbox = new VBox(button1, button2);
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
