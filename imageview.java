
package javafxex;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class imageview extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Image view");
        stage.setWidth(600);
        stage.setHeight(700);
        Scene scene = new Scene(new Group());
        VBox root = new VBox();    

        final ImageView selectedImage = new ImageView();   
        Image image1 = new Image(imageview.class.getResourceAsStream("image.jpg"));

        selectedImage.setImage(image1);

        root.getChildren().addAll(selectedImage);

        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}