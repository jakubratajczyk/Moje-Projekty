package SeconAppFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class AppFX2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        Scene scene = new Scene(gridPane,400,200);

        Button btn1 = new Button("Przycisk 1");
        Button btn2 = new Button("Przycisk 2");

        btn1.setStyle("-fx-base: #7DFF88; -fx-font: 16 consola; -fx-padding: 20px;");

        TextField tf1 = new TextField("Napis 1");
        TextField tf2 = new TextField("Napis 2");

        gridPane.add(btn1,2,2);
        gridPane.add(btn2,2,3);
        gridPane.add(tf1,3,2);
        gridPane.add(tf2,3,3);

        primaryStage.setScene(scene);
        primaryStage.setTitle("App 2");
        primaryStage.show();

    }
}
