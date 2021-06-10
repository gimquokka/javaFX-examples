package basic;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BindingDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        System.out.println(d1 + " : " + d2);
        d1.bind(d2);
        System.out.println(d1.getValue() + " : " + d2);
        d2.setValue(80.10);
        System.out.println(d1.getValue() + " : " + d2);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
