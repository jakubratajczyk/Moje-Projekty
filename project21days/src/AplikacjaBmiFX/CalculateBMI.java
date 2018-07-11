package AplikacjaBmiFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CalculateBMI extends Application {

    double height = 0.0;
    double weight = 0.0;
    double bmi = 0.0;

    @Override
    public void start(Stage primaryStage) {

        GridPane layout = new GridPane();
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Obliczanie BMI");

        Scene scene = new Scene(layout,640,480);

        TextField tfHeight = new TextField();
        tfHeight.setPrefWidth(40);
        TextField tfWeight = new TextField();

        Label labelHeight = new Label("Podaj wzrost");
        Label labelWeight = new Label("Podaj wagę");
        Button btnCalculateBmi= new Button("Oblicz bmi");
        Label result = new Label("Twoje BMI : 0.00");

        layout.add(labelHeight,3,2);
        layout.add(tfHeight,3,3);
        layout.add(labelWeight,3,4);
        layout.add(tfWeight,3,5);
        layout.add(btnCalculateBmi,3,7);
        layout.add(result,3,9);


        btnCalculateBmi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                height = Double.parseDouble(tfHeight.getText());
                weight = Double.parseDouble(tfWeight.getText());
                bmi = weight/Math.pow((height/100),2);
                bmi *= 100;
                bmi = Math.round(bmi);
                bmi /= 100;
                result.setText("Twoje BMI : " +bmi);
            }
        });



        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
