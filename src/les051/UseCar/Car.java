package les051.UseCar;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final int dataProduce;               //дата производства (не изменна после создания объекта)
    private String engineType;                   //тип двигателя
    private double maxSpeed;                     //максимальная скорость машины (если она новая)
    private double accelerationTimeTo100;        //время разгона до 100км/ч
    private int passengerCapacity;               //пассажировместимость
    private int passengerQuantity;               //кол-во пасажиров внутри в данный момент
    private double currentSpeed;                 //текущая скорость
    private int wheelCounter = 4;                //поточное количество колес
    private int doorCounter = 4;                 //поточное количество дверей
    private List<CarWheel> wheels = new ArrayList<>();  //массив колес
    private List<CarDoor> doors = new ArrayList<>();   //массив дверей


    public Car(int dataProduce) {
        this.dataProduce = dataProduce;
        this.setCarDoors();
        this.setCarWheels();

    }

    public Car(int dataProduce, String engineType, double maxSpeed, double accelerationTimeTo100,
               int passengerCapacity, int passengerQuantity, double currentSpeed) {
        this.dataProduce = dataProduce;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTimeTo100 = accelerationTimeTo100;
        this.passengerCapacity = passengerCapacity;
        this.passengerQuantity = passengerQuantity;
        this.currentSpeed = currentSpeed;
        this.setCarDoors();
        this.setCarWheels();

    }

    public void changeCurrentSpeed(double newSpeed) {
        currentSpeed = newSpeed;
        System.out.println("Now the current speed is: " + currentSpeed);
    }

    public void addOnePassenger() {
        if ((passengerQuantity + 1) <= passengerCapacity) {
            passengerQuantity++;
            System.out.println("One passenger was put in the car. Now " + passengerQuantity + " passenger(s)");
        } else {
            System.out.println("It is impossible to put 1 passenger. Exceeds the total number of passengers");
        }
    }

    public void disembarkOnePassengerQuantity() {
        if (passengerQuantity > 0) {
            passengerQuantity--;
            System.out.println("One passenger was disembarked from the car. Now " + passengerQuantity + " passenger(s)");
        } else {
            System.out.println("It is impossible to disembark one passenger. The current number is 0");
        }
    }

    public void clearPassengerQuantity() {
        passengerQuantity = 0;
        System.out.println("All passengers were disembarked from the car");
    }

    void removeAllWheels() {
        wheels.clear();
        System.out.println("All wheels were removed");
    }

    public void setCarDoors() {      //инициализация массива
        for (int i = 0; i < doorCounter; i++) {
            doors.add(new CarDoor());
        }
    }

    public void setCarWheels() {    //инициализация массива
        for (int i = 0; i < 4; i++) {
            wheels.add(new CarWheel());
        }
    }

    public CarDoor getIndexDoor(int index) {
        if ((index >= 0) && (index <= doorCounter - 1)) {
            System.out.println("index is: " + doors.get(index));
            return doors.get(index);
        } else {
            System.out.println("Doors with such an index do not exist");
            return null;
        }
    }

    public CarWheel getIndexWheel(int indexWheel) {
        if ((indexWheel >= 0) && (indexWheel <= wheelCounter - 1)) {
            System.out.println("index is: " + wheels.get(indexWheel));
            return wheels.get(indexWheel);
        } else {
            System.out.println("Wheels with such an index do not exist");
            return null;
        }
    }

    public void addNewWheelToCar(int x) {//
        for (int i = 0; i < x; i++) {
            wheels.add(new CarWheel());
        }
        wheelCounter += x;
        System.out.println("Wheels added. Total number of wheels: " + wheelCounter);//
    }

    public double getCurrentMaxSpeed(double minTWheel) {
        if ((passengerQuantity == 0) || (wheelCounter == 0)) {
            return 0;
        } else {
            return maxSpeed * minTWheel;
        }
    }

    public int getDataProduce() {
        return dataProduce;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getAccelerationTimeTo100() {
        return accelerationTimeTo100;
    }

    public void setAccelerationTimeTo100(double accelerationTimeTo100) {
        this.accelerationTimeTo100 = accelerationTimeTo100;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getWheelCounter() {
        return wheelCounter;
    }

    public void setWheelCounter(int wheelCounter) {
        this.wheelCounter = wheelCounter;
    }

    public int getDoorCounter() {
        return doorCounter;
    }

    public void setDoorCounter(int doorCounter) {
        this.doorCounter = doorCounter;
    }

    public List<CarWheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<CarWheel> wheels) {
        this.wheels = wheels;
    }

    public List<CarDoor> getDoors() {
        return doors;
    }

    public void setDoors(List<CarDoor> doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Info about car " +
                "dataProduce: " + dataProduce +
                ", engineType: '" + engineType + '\'' +
                ", maxSpeed: " + maxSpeed +
                ", accelerationTimeTo100: " + accelerationTimeTo100 +
                ", passengerCapacity: " + passengerCapacity +
                ", passengerQuantity: " + passengerQuantity +
                ", currentSpeed: " + currentSpeed +
                ", wheelCounter: " + wheelCounter;
    }
}