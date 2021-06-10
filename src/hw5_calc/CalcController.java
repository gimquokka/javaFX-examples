package hw5_calc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalcController extends Application {
    private final Calc calc = new Calc();

    private TextField tfOp1 = new TextField();
    private TextField tfOp2 = new TextField();
    private TextField tfResult = new TextField();

    private Button btPlus = new Button("+");
    private Button btMinus = new Button("-");
    private Button btMul = new Button("*");
    private Button btDiv = new Button("/");

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // 1. GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Number 1"), 0, 0);
        gridPane.add(tfOp1, 1, 0);
        gridPane.add(new Label("Number 2"), 0, 1);
        gridPane.add(tfOp2, 1, 1);
        gridPane.add(btPlus, 1, 1);

        // 2. HBox
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btPlus, btMinus, btMul, btDiv);
        hBox.setPadding(new Insets(5, 5, 5, 5));
        hBox.setSpacing(5);

        // 3. GridPane
        GridPane ResultPane = new GridPane();
        ResultPane.setHgap(5);
        ResultPane.setVgap(5);
        ResultPane.add(new Label("Result"), 0, 0);
        ResultPane.add(tfResult, 1, 0);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);
        ResultPane.setAlignment(Pos.CENTER);

        tfOp1.setAlignment(Pos.BOTTOM_RIGHT);
        tfOp2.setAlignment(Pos.BOTTOM_RIGHT);
        tfResult.setEditable(false);

//        gridPane.setStyle("-fx-background-color: yellow");
        // Process event
        btPlus.setOnAction(e -> {
            setTfOp();
            tfResult.setText(calc.getResult('+'));
        });
        btMinus.setOnAction(e -> {
            setTfOp();
            tfResult.setText(calc.getResult('-'));
        });
        btDiv.setOnAction(e -> {
            setTfOp();
            tfResult.setText(calc.getResult('/'));
        });
        btMul.setOnAction(e -> {
            setTfOp();
            tfResult.setText(calc.getResult('*'));
        });

        // Create a scene and place it in the stage
        VBox vBox = new VBox();
        vBox.getChildren().setAll(gridPane, hBox,ResultPane);
        vBox.setAlignment(Pos.CENTER);
//        vBox.setStyle("-fx-background-color: green");

        Scene scene = new Scene(vBox, 400, 250);
        primaryStage.setTitle("Calc"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    private void setTfOp() {
        calc.setOp1(tfOp1.getText());
        calc.setOp2(tfOp2.getText());
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

class Calc {
    private double op1;
    private double op2;
    private char operator;

    public void setOp1(String op1) {
        this.op1 = Double.valueOf(op1);
    }

    public void setOp2(String op2) {
        this.op2 = Double.valueOf(op2);
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getResult(char operator) {
        switch (operator) {
            case '+':
                return String.valueOf(op1 + op2);
            case '-':
                return String.valueOf(op1 - op2);
            case '*':
                return String.valueOf(op1 * op2);
            case '/':
                return String.valueOf(op1 / op2);
            default:
                return "Error";
        }
    }
}
