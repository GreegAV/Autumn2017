package Training;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class JavaFX extends Application{

    Stage window;
    BorderPane layout;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        window.setTitle("Hi!");

//        Group group = new Group();
//        Scene scene = new Scene(group,300,400);

//        Menu fileMenu = new Menu("File");
//        fileMenu.a
//        primaryStage.setScene(scene);
//        primaryStage.show();

    }
}
