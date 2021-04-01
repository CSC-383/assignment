
package javafxex;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class multistage extends Application {

    

    public void start(Stage primaryStage) {

        Accordion stage = new Accordion();

        TitledPane pane1 = new TitledPane("Boats" , new Label("Show boats"));
        TitledPane pane2 = new TitledPane("Cars"  , new Label("Show cars"));
        TitledPane pane3 = new TitledPane("Planes", new Label("Show planes"));

        stage.getPanes().add(pane1);
        stage.getPanes().add(pane2);
        stage.getPanes().add(pane3);

        VBox vBox = new VBox(stage);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}