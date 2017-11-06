package les05.Car;
/*
Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.
 */

public class Car {

    public void driveCar(){
        System.out.println("Method driveCar");
    }

    public void changeWheel(){
        System.out.println("Method changeWheel");
    }

    public void fillCar(){
        System.out.println("Method fillCar");
    }

    public String modelCar(){
        String model="Method modelCar";
        return model;
    }
}
