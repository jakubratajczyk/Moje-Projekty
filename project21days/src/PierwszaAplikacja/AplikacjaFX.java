package PierwszaAplikacja;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;


public class AplikacjaFX extends Application{

    @Override
    public void start(Stage primaryStage) {
        BorderPane layout = new BorderPane();
        Scene scene = new Scene(layout,400,200);

        TextField textField = new TextField();
        primaryStage.setTitle("Pierwsza aplikacja FX");
        Button button1 = new Button("Przycisk");
        Label label = new Label("Średnia wynosi : 0.0");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                String textFromTextField = textField.getText();
                String[] splittedText = textFromTextField.split(",");
                double avg=0.0;
                for(String x:splittedText)
                {
                    avg+=Double.parseDouble(x);

                }
                avg=avg/splittedText.length;
                label.setText("Średnia wynosi : "+avg);
            }
        });
        VBox vbox = new VBox();
        vbox.getChildren().addAll(textField,button1,label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        layout.setCenter(vbox);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
