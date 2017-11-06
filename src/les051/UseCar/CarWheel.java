package les051.UseCar;

public class CarWheel {

    private double tireCondition;

    public CarWheel() {
        this(1.0);
    }

    public CarWheel(double tireCondition) {
        this.tireCondition = tireCondition;
    }

    public void changeTireOnNew() {
        tireCondition = 1.0;
        System.out.println("The tire was changed for new one");
    }

    public void eraseTheTireByPercent(double percent) {
        if (tireCondition - (tireCondition * percent / 100) > 0) {
            tireCondition -= (tireCondition * percent / 100);
            System.out.println("Our tire is worn out on " + percent + "% and now has a state of erasure " + (float) tireCondition);
        } else {
            tireCondition = 0;
        }
    }

    public double getTireCondition() {
        return tireCondition;
    }

    public void setTireCondition(double tireCondition) {
        this.tireCondition = tireCondition;
    }

    @Override
    public String toString() {
        return "Info about condition of " +
                "tire: " + tireCondition;
    }
}