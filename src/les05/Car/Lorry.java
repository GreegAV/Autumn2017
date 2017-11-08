package les05.Car;

public class Lorry extends Car{
    int carryLoad;

    public Lorry(String model, int tank, int wheelRadius, boolean wheelsOK, int carryLoad) {
        super(model, tank, wheelRadius, wheelsOK);
        this.carryLoad=carryLoad;
    }

    @Override
    public String toString() {
        return "Пикап "+super.toString()+" грузоподъёмностью "+carryLoad+" кг.";
    }
}
