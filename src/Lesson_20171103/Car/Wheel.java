package Lesson_20171103.Car;

/**
 * У колес может быть размер
 * Колеса могут быть в плохом состоянии
 */
public class Wheel {
    private int radius;
    private boolean okStatus;

    public Wheel(int radius, boolean okStatus) {
        this.setRadius(radius);
        this.setOkStatus(okStatus);
    }


    public void setRadius(int radius) {
        if ( radius < 0 ) {
            System.out.println("Колеса не могут иметь отрицательный размер. Катаемся на стандартных 14\"!");
            this.radius = 14;
        } else {
            this.radius = radius;
        }
    }


    public boolean isOkStatus() {
        return okStatus;
    }

    public void setOkStatus(boolean okStatus) {
        this.okStatus = okStatus;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Wheel wheel = (Wheel) o;
        return radius == wheel.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return "Это колесо " + radius + " радиуса.";
    }
}
