package les05.Car;

/**
 * Created by avg-m on 03/11/2017.
 */
public class Wheel {
    private int radius;
    boolean okStatus;

    public Wheel(int radius, boolean okStatus) {
        this.radius = radius;
        this.okStatus = okStatus;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public boolean isOkStatus() {
        return okStatus;
    }

    public void setOkStatus(boolean okStatus) {
        this.okStatus = okStatus;
    }







}
