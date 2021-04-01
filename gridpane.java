package javafxex;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gridpane extends Application {

    public void start(Stage primaryStage) {

        primaryStage.setTitle("User Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15, 15, 15, 15));
        grid.setVgap(8);
        grid.setHgap(10);

        Label name = new Label("User name");
        GridPane.setConstraints(name, 0, 0);

        TextField nametextfield = new TextField();
        GridPane.setConstraints(nametextfield, 1, 0);

        Label password = new Label("Password");
        GridPane.setConstraints(password, 0, 1);

        TextField passtextfield = new TextField();
        GridPane.setConstraints(passtextfield, 1, 1);

        Button button = new Button("Log in");
        GridPane.setConstraints(button, 1, 2);

        grid.getChildren().addAll(name, nametextfield, password,
                passtextfield, button);

        Scene scene1 = new Scene(grid, 350, 200);
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
