package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class NodeStyleRotateDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: purple;");
        pane.getChildren().add(btOK);

        pane.setRotate(30);
        pane.setStyle("-fx-border-color: red; -fx-background-color: green");

        primaryStage.setScene(new Scene(pane, 200, 300));
        primaryStage.setTitle("NodeStyleRotateDemo");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
