package SeconAppFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.awt.*;

public class AppFX extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane layout = new BorderPane();

        Scene scene = new Scene(layout, 400,200);

        Label infLabel = new Label("Średnia wynosi : 0.0" );
        Button btn = new Button("Przycisk");
        TextField textField = new TextField();


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event){
                try{
                    String[] textFielded = textField.getText().split(",");
                    double avg=0.0;
                    for(String x:textFielded){
                        avg+=Double.parseDouble(x);
                    }
                    avg=avg/textFielded.length;
                    infLabel.setText("Średnia wynosi : " + avg);
                }catch(NumberFormatException ex)
                {
                    infLabel.setText("Wprowadzono niepoprawną wartość");
                    textField.clear();
                }
            }
        });

        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Uruchomiono metodę TextField");
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField,btn,infLabel);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        layout.setCenter(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Druga aplikacja FX");
        primaryStage.show();
    }
}
