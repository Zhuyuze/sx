package calculate;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CALCU extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);

        Button add = new Button("+");
        pane.add(add, 0, 1);
        Button sub = new Button("-");
        pane.add(sub, 1, 1);
        Button mul = new Button("*");
        pane.add(mul, 2, 1);
        Button div = new Button("/");
        pane.add(div, 3, 1);
        Button cal = new Button("OK");
        pane.add(cal, 4, 1);
        int side = 100;

        add.setPrefSize(side, side);
        sub.setPrefSize(side, side);
        mul.setPrefSize(side, side);
        div.setPrefSize(side, side);
        cal.setPrefSize(side, side);
        Font f = Font.font("Serif", FontWeight.BOLD, 24);
        add.setFont(f);
        sub.setFont(f);
        mul.setFont(f);
        div.setFont(f);
        cal.setFont(f);

        TextField s0 = new TextField("");
        pane.add(s0, 0, 0);
        TextField s1 = new TextField("");
        pane.add(s1, 1, 0);
        TextField s2 = new TextField("");
        pane.add(s2, 2, 0);
        TextField s3 = new TextField("=");
        pane.add(s3, 3, 0);
        TextField s4 = new TextField("");
        pane.add(s4, 4, 0);

        s0.setPrefSize(side, side);
        s1.setPrefSize(side, side);
        s2.setPrefSize(side, side);
        s3.setPrefSize(side, side);
        s4.setPrefSize(side, side);
        s0.setFont(f);
        s1.setFont(f);
        s2.setFont(f);
        s3.setFont(f);
        s4.setFont(f);

        s1.setEditable(false);
        s3.setEditable(false);
        s4.setEditable(false);

        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                s1.setText("+");
            }
        });
        sub.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                s1.setText("-");
            }
        });
        mul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                s1.setText("*");
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                s1.setText("/");
            }
        });

        cal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (s1.getText().equals("+")) {
                    double t1 = Double.parseDouble(s0.getText());
                    double t2 = Double.parseDouble(s2.getText());
                    s4.setText(Double.toString(t1 + t2));
                } else if (s1.getText().equals("-")) {
                    double t1 = Double.parseDouble(s0.getText());
                    double t2 = Double.parseDouble(s2.getText());
                    s4.setText(Double.toString(t1 - t2));
                } else if (s1.getText().equals("*")) {
                    double t1 = Double.parseDouble(s0.getText());
                    double t2 = Double.parseDouble(s2.getText());
                    s4.setText(Double.toString(t1 * t2));
                } else if (s1.getText().equals("/")) {
                    double t1 = Double.parseDouble(s0.getText());
                    double t2 = Double.parseDouble(s2.getText());
                    s4.setText(Double.toString(t1 / t2));
                }
            }
        });
        int width = 500, height = 200;
        Scene scene = new Scene(pane, width, height);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Application.launch(args);
    }

}
