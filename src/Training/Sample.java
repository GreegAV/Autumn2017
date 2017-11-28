package Training;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by avg-m on 24/11/2017.
 */

    public class Sample extends Application { // JavaFX приложения наследуют класс javafx.application.Application

        // чтобы создать JavaFX приложения, достаточно реализовать метод start(Stage)
        @Override
        public void start(Stage primaryStage) throws Exception{
            // Stage - это контейнер, ассоциированный с окном

            // Если вы загляните в файл sample.fxml, то у видете в нем XML объявление элемента GridPane,
            // т.е. табличного контейнера
            // Этот контейнер мы будем считать корневым,
            // т.е. все элементы нашего приложения будут содержаться в нем
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            primaryStage.setTitle("Hello World"); // задаем заголовок окна

            // создаем сцену с заданными шириной и высотой и содержащую наш корневым контейнером, и связываем ее с окном
            primaryStage.setScene(new Scene(root, 300, 275));

            primaryStage.show(); // запускаем окно
        }

        // метод main в JavaFX приложениях не является обязательным
        public static void main(String[] args) {
            launch(args);
        }
    }