package Training.Shape;

/**
 * Created by avg-m on 05/12/2017.
 */
public class SimpleShapeFactory {
    public Shape createShape(String type) {
        Shape shape=null;
        if (type.equalsIgnoreCase("triangle")) {
            shape = new Triangle();
        } else if (type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }
        return shape;
    }
}
