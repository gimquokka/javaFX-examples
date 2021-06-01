package sample;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.stage.Stage;

public class BidirectionalBindingDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        System.out.println(d1.getValue() + " : " + d2.getValue());
        d1.bindBidirectional(d2);
        System.out.println(d1.getValue() + " : " + d2.getValue());
        d2.setValue(80.10);
        System.out.println(d1.getValue() + " : " + d2.getValue());
        d1.setValue(10.10);
        System.out.println(d1.getValue() + " : " + d2.getValue());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
