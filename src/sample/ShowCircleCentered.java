package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Centered Circle");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
