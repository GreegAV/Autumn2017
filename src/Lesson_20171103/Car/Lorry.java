package les05.Car;

public class Lorry extends Car {
    int carryLoad;

    public Lorry(String model, int tank, int wheelRadius, boolean wheelsOK, int carryLoad) {
        super(model, tank, wheelRadius, wheelsOK);
        this.carryLoad = carryLoad;
    }

    @Override
    public String toString() {
        return "Пикап " + super.toString() + " грузоподъёмностью " + carryLoad + " кг.";
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;

        Lorry lorry = (Lorry) o;
        return this.modelCar().equals(lorry.modelCar());
    }

    @Override
    public int hashCode() {
        return this.carryLoad;
    }
}
