package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Button button = new Button("My Button");
        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();







    }


    public static void main(String[] args) {
        launch(args);
    }
}
