package les05.Car;

/**
 * Created by avg-m on 03/11/2017.
 */
public class Wheel {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
        System.out.println("Создано колесо.");
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


}
