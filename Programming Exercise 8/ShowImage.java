//This work is all my, Alex Browns
package TestImage2;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.image.ImageView; 
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.Scene;

public class ShowImage extends Application {
    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<53; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int randomnum1 =  list.get(0);
        int randomnum2 =  list.get(1);
        int randomnum3 =  list.get(2);

        Pane pane = new HBox(30);
        pane.setPadding(new Insets(5,5,5,5));
        
        String card1path = "image/card/" + randomnum1 + ".png";
        String card2path = "image/card/" + randomnum2 + ".png";
        String card3path = "image/card/" + randomnum3 + ".png";

        Image image = new Image(card1path);
        pane.getChildren().add(new ImageView(image));
        Image image2 = new Image(card2path);
        ImageView imageView2 = new ImageView(image2);
        pane.getChildren().add(imageView2);
        Image image3 = new Image(card3path);
        ImageView imageView3 = new ImageView(image3);
        pane.getChildren().add(imageView3);
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Three Random Cards");// Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public static void main(String[] args) {
        launch(args);
    }
}