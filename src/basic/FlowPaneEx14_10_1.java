package basic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FlowPaneEx14_10_1 extends Application {
    // From Listing 14.10 (p. 575)
    @Override
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5); // Setting the padding with an Insets object gives us a
                         // margin inside the pane. Just as angles are always
                         // Place nodes in the paneclockwise, the Insets are specified in clockwise order

        pane.getChildren().addAll(new Label("First Name:"),
                new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("ShowFlowPane"); // Set the stage title
        primaryStage.setScene(scene);
        primaryStage.show();
    }


        public static void main (String[]args){
            launch(args);
        }
    }
