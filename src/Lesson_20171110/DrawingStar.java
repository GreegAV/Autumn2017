package Lesson_20171110;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Scanner;

public class DrawingStar extends Application{
    private int numberOfStarBeams = 5;
    private int centerStarX;
    private int centerStarY;
    private double radius;

    public static void main(String[] args) {
        launch(args);
    }

    public void dataInput(Scanner in){
        System.out.print("Enter X of the star center: ");
        this.centerStarX = in.nextInt();
        System.out.print("Enter Y of the star center: ");
        this.centerStarY = in.nextInt();
        System.out.print("Enter radius of the star: ");
        this.radius = in.nextDouble();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        initUI(primaryStage);
    }

    private void initUI(Stage primaryStage) {
        primaryStage.setTitle("Star");
        Scanner in = new Scanner(System.in);
        dataInput(in);
        Pane root = new Pane();
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawStarShape(gc);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 300, 250, Color.ANTIQUEWHITE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void drawStarShape(GraphicsContext gc) {
        double innerRadius = radius / 2.5;
        double startingAngle = Math.PI / 2;
        double angleOfRotation = Math.PI / numberOfStarBeams;

        double[] xPoints = new double[2* numberOfStarBeams];
        double[] yPoints = new double[2* numberOfStarBeams];

        for (int i = 0; i < 2 * numberOfStarBeams; i++) {
            if (i % 2 == 1){
                xPoints[i] = centerStarX + innerRadius * Math.cos(startingAngle);
                yPoints[i] = centerStarY - innerRadius * Math.sin(startingAngle);
            } else {
                xPoints[i] = centerStarX + radius * Math.cos(startingAngle);
                yPoints[i] = centerStarY - radius * Math.sin(startingAngle);
            }
            startingAngle += angleOfRotation;
        }
        gc.strokePolygon(xPoints, yPoints, xPoints.length);
        gc.drawImage(null,centerStarX,centerStarY);
    }
}
