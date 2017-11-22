package Training;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFX extends Application{
    public static void main(String[] args) {
        Application.launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group,300,400);

        primaryStage.setTitle("Hi!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
