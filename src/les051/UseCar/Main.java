package les051.UseCar;

//import les04.Car;

public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor(true, false);
        System.out.println(carDoor.toString());
        carDoor.checkConditionOfTheWindow();
        carDoor.checkConditionOfTheDoor();
        System.out.println();

        CarWheel carWheel = new CarWheel(0.75);
        System.out.println(carWheel.toString());
        carWheel.eraseTheTireByPercent(0.35);
        carWheel.changeTireOnNew();
        System.out.println();


        Car car = new Car(2017, "gasoline", 125.1,
                5.0, 4, 2, 90);
        System.out.println(car.toString());
        car.changeCurrentSpeed(35.1);
        car.addOnePassenger();
        car.disembarkOnePassengerQuantity();
        car.clearPassengerQuantity();
        car.removeAllWheels();
        car.addNewWheelToCar(5);
        car.getCurrentMaxSpeed(0.21);
        car.getIndexDoor(2);
        car.setCarWheels();
        car.setCarDoors();

    }
}