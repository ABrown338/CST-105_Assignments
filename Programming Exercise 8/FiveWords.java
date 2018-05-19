//This work is all my, Alex Browns
package fivewords;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FiveWords extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: white");
        
        Label word1 = new Label("Java");
        Label word2 = new Label("Java");
        Label word3 = new Label("Java");
        Label word4 = new Label("Java");
        Label word5 = new Label("Java");

        word1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word1.setTextFill(Paint.valueOf("#FF0000"));
        word1.setOpacity(0.4);
        word2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word2.setTextFill(Paint.valueOf("#00FF00"));
        word2.setOpacity(0.8);
        word3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word3.setTextFill(Paint.valueOf("#0000FF"));
        word3.setOpacity(1.0);
        word4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word4.setTextFill(Paint.valueOf("#FFFF00"));
        word4.setOpacity(0.6);
        word5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word5.setTextFill(Paint.valueOf("#00FFFF"));
        word5.setOpacity(0.9);

        root.getChildren().addAll(word1, word2, word3, word4, word5);
        root.setRotate(90);

        Scene scene = new Scene(root, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FiveWords");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
   