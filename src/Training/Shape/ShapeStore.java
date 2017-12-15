package Training.Shape;

/**
 * Created by avg-m on 05/12/2017.
 */
public class ShapeStore {
    SimpleShapeFactory factory;

    public ShapeStore(SimpleShapeFactory factory){
        this.factory=factory;
    }

    public Shape createShape(String type) {
        Shape shape;
        shape=factory.createShape(type);
        return shape;
    }
}
