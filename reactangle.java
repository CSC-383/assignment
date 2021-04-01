package javafxex;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class reactangle extends Application {

    @Override
    public void start(Stage s) throws Exception {

        s.setTitle("Creation of a rectangle");

        Group gp = new Group();

        Rectangle r = new Rectangle();

        r.setX(30);
        r.setY(30);
        r.setWidth(250);
        r.setHeight(245);
        r.setArcHeight(34);
        r.setArcWidth(35);
        r.setFill(Color.ORANGE);
        gp.getChildren().addAll(r);
        Scene sc = new Scene(gp, 600, 500, Color.BROWN);
        s.setScene(sc);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
